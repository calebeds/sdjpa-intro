package com.calebe.sdjpaintro.repositories;

import com.calebe.sdjpaintro.domain.composite.AuthorComposite;
import com.calebe.sdjpaintro.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorCompositeRepository extends JpaRepository<AuthorComposite, NameId> {
}
