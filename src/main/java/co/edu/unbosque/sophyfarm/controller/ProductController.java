package co.edu.unbosque.sophyfarm.controller;

import co.edu.unbosque.sophyfarm.model.Product;
import co.edu.unbosque.sophyfarm.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products/search")
    public List<Product> search(@RequestParam(required = false) String query,
                                @RequestParam(required = false) Short category,
                                @RequestParam(required = false) BigDecimal minPrice) {
        return service.search(query, category, minPrice);
    }

    @GetMapping("/products/{id}/details")
    public Product details(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PutMapping("/inventory/{id}/stock")
    public Product updateStock(@PathVariable Integer id, @RequestParam Integer newStock) {
        return service.updateStock(id, newStock);
    }

    @GetMapping("/inventory/low-stock")
    public List<Product> lowStock() {
        return service.lowStock();
    }
}

