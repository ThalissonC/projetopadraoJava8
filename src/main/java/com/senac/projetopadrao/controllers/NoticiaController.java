package com.senac.projetopadrao.controllers;


import com.senac.projetopadrao.models.Noticia;
import com.senac.projetopadrao.models.Produto;
import com.senac.projetopadrao.models.Satelite;
import com.senac.projetopadrao.repositorys.NoticiaRepository;
import com.senac.projetopadrao.repositorys.SateliteRepository;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/noticias")
public class NoticiaController {

    @Autowired
    NoticiaRepository noticiaRepositoryi;

    @GetMapping("/")
    public ModelAndView listaNoticias() {
        ModelAndView mv = new ModelAndView("noticias");

        ArrayList<Noticia> noticias = new ArrayList<Noticia>();

        noticias = (ArrayList<Noticia>) noticiaRepositoryi.findAll();

        mv.addObject("listaNoticias", noticias);

        return mv;
    }

    @GetMapping("/add")
    /*public ModelAndView addUsuarioPage(){
        ModelAndView movelAndView = new ModelAndView("usuarios_add")
        Usuario usuario = new Usuario();
        modelAndView.addObject("usuario", usuario);
        return modelAndView;
}
    */
        public String addNoticiaPage(Noticia noticia){
        return "noticias_add";
    }

    @PostMapping("/add")
        public String addNoticia(@Validated Noticia noticia){
            noticiaRepositoryi.save(noticia);

            return "redirect:/noticias/";
    }
}

