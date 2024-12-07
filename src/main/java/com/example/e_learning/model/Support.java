package com.example.e_learning.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "supports") // Spécifie la collection MongoDB
public class Support {

    @Id
    private String id; // MongoDB utilise généralement un ID de type String

    @Field
    private String nom;

    @Field
    private TypeSupport type; // Enum

    @Field
    private String fichier; // Stockera le chemin ou l'URL du fichier

    @DBRef
    private Module module; // Référence à l'entité Module

    // Référence à l'entité Professeur

    public Support(String id, String nom, TypeSupport type, String fichier, Module module, Professeur professeur) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.fichier = fichier;
        this.module = module;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public TypeSupport getType() {
        return type;
    }

    public String getFichier() {
        return fichier;
    }

    public Module getModule() {
        return module;
    }



    public void setId(String id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(TypeSupport type) {
        this.type = type;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }

    public void setModule(Module module) {
        this.module = module;
    }


}
