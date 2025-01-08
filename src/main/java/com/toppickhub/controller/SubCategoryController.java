package main.java.com.toppickhub.controller;

@RestController
@RequestMapping("/api/subcategories")
public class SubCategoryController {
    @Autowired
    private SubCategoryService subCategoryService;

    @GetMapping
    public List<SubCategory> getAllSubCategories() {
        return subCategoryService.getAllSubCategories();
    }

    @GetMapping("/{id}")
    public SubCategory getSubCategoryById(@PathVariable Long id) {
        return subCategoryService.getSubCategoryById(id);
    }
}

