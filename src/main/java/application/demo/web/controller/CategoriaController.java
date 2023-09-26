package application.demo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import application.demo.web.models.Categoria;
import application.demo.web.service.CategoriaService;



@Controller
@RequestMapping("/categorias")
public class CategoriaController {
  @Autowired
  private CategoriaService categoriaService ;

  public CategoriaController(CategoriaService categoriaService) {
    this.categoriaService = categoriaService;
  }

  @GetMapping
    public String listarCategorias(Model model) {
      List<Categoria> categorias = categoriaService.buscarTodos();
      model.addAttribute("categorias", categorias);
        return "categoria/listaCategorias";
    }

  @GetMapping("/novo")
    public String formCategoria(Model model) {
      model.addAttribute("categoria", new Categoria());
      return "categoria/formCategoria";
    }

  @PostMapping("/novo")
  public String cadastrarCategoria(@ModelAttribute Categoria categoria){
      categoriaService.cadastrar(categoria);
      return "formCategoria";
  }

  // @PutMapping("/{id}")
  // public Categoria editarCategoria(@PathVariable Long id, @RequestBody Categoria categoria){
  //   return categoriaService.editar(id, categoria);
  // }
  // @DeleteMapping("/{id}")
  // public void deletarCategoria(@PathVariable Long id){
  //   categoriaService.deletar(id);
  // }

  // @GetMapping("/{id}")
  // public Categoria buscarPorIdCategoria(@PathVariable Long id){
  //   return categoriaService.buscarPorId(id);
  // }
}
