/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenanswer7;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;
import static com.mongodb.client.model.Filters.eq;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Tony
 */
public class Respuesta {
    
    public static void main(String[] args) {
        
        MongoClient client = new MongoClient();
        MongoDatabase database = client.getDatabase("photo-sharing");
        
        MongoCollection<Document> images = database.getCollection("images");
        MongoCollection<Document> albums = database.getCollection("albums");
        
        MongoCursor<Document> cursor = images.find().iterator();
        try {
            while (cursor.hasNext()) {
                Document curImages = cursor.next();
                Object id = curImages.get("_id");
                Bson filter = new Document("images", id);
                MongoCursor<Document> curAlbum = albums.find(filter).iterator();
                
                if(!curAlbum.hasNext()){
                    images.deleteOne(eq("_id", id));
                }
            }
        } finally {
            cursor.close();
        }

        
    }
    
}
