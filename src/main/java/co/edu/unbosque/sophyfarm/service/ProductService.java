package co.edu.unbosque.sophyfarm.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.unbosque.sophyfarm.model.Product;
import co.edu.unbosque.sophyfarm.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> search(String query, Short category, BigDecimal minPrice) {
        return repo.searchProducts(query, category, minPrice);
    }

    public Product findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public List<Product> lowStock() {
        return repo.findLowStockProducts();
    }

    public Product updateStock(Integer id, Integer newStock) {
        Product p = repo.findById(id).orElse(null);
        if (p != null) {
            p.setExistencia(newStock);
            repo.save(p);
        }
        return p;
    }
}

