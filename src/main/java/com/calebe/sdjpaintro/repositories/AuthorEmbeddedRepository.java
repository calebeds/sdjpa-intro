package com.calebe.sdjpaintro.repositories;

import com.calebe.sdjpaintro.domain.composite.AuthorEmbedded;
import com.calebe.sdjpaintro.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorEmbeddedRepository extends JpaRepository<AuthorEmbedded, NameId> {
}
