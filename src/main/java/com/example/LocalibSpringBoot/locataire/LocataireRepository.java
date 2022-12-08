package com.example.LocalibSpringBoot.locataire;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocataireRepository extends MongoRepository<Locataire, String> {
}
