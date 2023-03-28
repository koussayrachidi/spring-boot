package com.koussay.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.koussay.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
}