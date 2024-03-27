package com.jpfuentealba.companiescrud.repositories;

import com.jpfuentealba.companiescrud.entities.WebSite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebSiteRepository extends JpaRepository<WebSite, Long> {
}
