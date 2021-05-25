package com.senac.projetopadrao.SchedulingTasks;

import com.senac.projetopadrao.models.Noticia;
import com.senac.projetopadrao.models.Satelite;
import com.senac.projetopadrao.repositorys.NoticiaRepository;
import com.senac.projetopadrao.repositorys.SateliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BuscaNoticias {

    //Json convert
    //Json para java online

    @Autowired
    NoticiaRepository noticiaRepository;

    @Scheduled(fixedRate = 5000)
    public void verificarNoticia(){
        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();

        Noticia noticia = restTemplate.getForObject(
                "http://servicodados.ibge.gov.br/api/v3/noticias/",
                Noticia.class);

        noticiaRepository.save(noticia);

    }

}