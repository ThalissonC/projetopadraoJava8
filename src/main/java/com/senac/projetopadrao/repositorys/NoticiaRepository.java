package com.senac.projetopadrao.repositorys;

import com.senac.projetopadrao.models.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
}
