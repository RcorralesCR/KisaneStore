package com.KisaneStore.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, 
            String carpeta, 
            Long id);
    
    //El BuketName es el <id del proyecto>+.appspot.com
    final String BucketName="kisamecr-c8828.appspot.com";
    
    //Esta es la ruta base de estre proyecto en el Storage
    final String rutaSuperiorStorage="kisamecr";
    
    //Ubicaciòn del archivo de configuraciòn Json
    final String rutaJsonFile="firebase";
    
    final String archivoJsonFile="kisamecr-c8828-firebase-adminsdk-gocfj-2a7bfff856.json";
}
