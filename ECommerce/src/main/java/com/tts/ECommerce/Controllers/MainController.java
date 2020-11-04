package com.tts.ECommerce.Controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.tts.ECommerce.Models.Product;
import com.tts.ECommerce.Services.ProductService;

@Controller
@ControllerAdvice // This makes the `@ModelAttribute`s of this controller available to all
                  // controllers, for the navbar.
public class MainController {
    @Autowired
    ProductService productService;

    // public Product(int quantity, float price, String description,
    // String name, String brand, String category,String image) {

    public void addNew() {
        List<Product> allProducts = productService.findAll();

        if (allProducts.isEmpty()) {

            List<Product> newProducts = new ArrayList<Product>();

            newProducts.add(new Product(4, (float) 1500.00, "Apple MacBook Pro", "MacBook Pro", "Apple", "computer",
                    "images/apple_mlh32ll_a_15_4_macbook_pro_with_1293726.jpg"));

            newProducts.add(new Product(3, (float) 1000.00, "C7 ST Desktop Front Edit", "Desktop", "Dell", "computer",
                    "images/C7_ST_Desktop_Front.jpg"));

            newProducts.add(new Product(12, (float) 800.00, "New iPhone 8, Silver", "IPhone 8", "Apple", "phone",
                    "images/iphone8-silver-select-2017.jpg"));

            newProducts.add(new Product(7, (float) 700.00, "New iPhone", "IPhone", "IPhone", "phone",
                    "images/iphonexfrontback-800x573.jpg"));

            for (Product product : newProducts) {
                productService.save(product);
            }
        } else {

            System.out.println("You don't need more items!");
        }
    }

    @GetMapping("/")
    public String main() {
        addNew();
        return "main";
    }

    @ModelAttribute("products")
    public List<Product> products() {
        return productService.findAll();
    }

    @ModelAttribute("categories")
    public List<String> categories() {
        return productService.findDistinctCategories();
    }

    @ModelAttribute("brands")
    public List<String> brands() {
        return productService.findDistinctBrands();
    }

    @GetMapping("/filter")
    public String filter(@RequestParam(required = false) String category, @RequestParam(required = false) String brand,
            Model model) {
        List<Product> filtered = productService.findByBrandAndOrCategory(brand, category);
        model.addAttribute("products", filtered); // Overrides the @ModelAttribute above.
        return "main";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
