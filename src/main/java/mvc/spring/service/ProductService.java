package mvc.spring.service;
//
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mvc.spring.model.Product;
import mvc.spring.model.ProductRepository;

/**
 * ���i�T�[�r�X
 *
 */
@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;

	/**
	 * �S������
	 * 
	 * @return
	 */
	public List<Product> findAll() {
		return this.repo.findAll();
	}

	/**
	 * �ڍ׌���
	 * 
	 * @param itemId ���iID
	 * @return
	 */
	public Product find(Long itemId) {
		return this.repo.findById(itemId.longValue()).get();
	}

	/**
	 * �ۑ�����
	 * 
	 * @param item ���i
	 * @return
	 */
	@Transactional
	public Product save(Product item) {
		return this.repo.save(item);
	}

	/**
	 * �폜����
	 * 
	 * @param item ���i
	 */
	@Transactional
	public void delete(Product item) {
		this.repo.delete(item);
	}
}
