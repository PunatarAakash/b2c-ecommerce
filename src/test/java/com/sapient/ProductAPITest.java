package com.sapient;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

//import org.junit.runner.RunWith;


/*@RunWith(SpringRunner.class)
@WebMvcTest
public class ProductAPITest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Test
    public void findAll() throws Exception {
        Product product = new Product();

        List<Product> products = Arrays.asList(product);
        given(productService.findAll()).willReturn(products);

        this.mockMvc.perform(get("/api/products/filter/size/M"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id': 1,'name': 'Stock 1';'quantity': 1;'size'}]"));
    }
}*/