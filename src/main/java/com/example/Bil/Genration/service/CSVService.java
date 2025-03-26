//package com.example.Bil.Genration.service;
//
//
//import com.example.Bil.Genration.model.Product;
//import com.opencsv.CSVWriter;
//import org.springframework.stereotype.Service;
//
//import java.io.FileWriter;
//
//import java.util.List;
//
//@Service
//public class CSVService {
//
//
//
//
//    public void genratecsv (List<Product> products) throws Exception {
//        String filePath = "product.csv";
//
//
//
//        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
//            String[] header = {"Product id", "Product name", "quantity"};
//            writer.writeNext(header);
//
//
//            for (Product product : products) {
//                String[] data =
//                        {
//
//                                String.valueOf(product.getId()),
//                                product.getName(),
//                                String.valueOf(product.getQuantity())
//                        };
//                writer.writeNext(data);
//            }
//        }
//    }
//}