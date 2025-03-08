package br.com.grs.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
import br.com.grs.blog.models.Postage;

public interface PostageRepository extends JpaRepository<Postage, UUID> {
}
