/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Christina
 */
public class Plantilla {
        
    String titulo;
    
    Document documento;
    FileOutputStream archivo;
    Paragraph tit;

    public Plantilla(String titulo) {
        this.titulo = titulo;
        documento = new Document();
        tit = new Paragraph(this.titulo);
    }
    
  
    public void crearPlantilla(String nomArch,String titulo, List<Ingrediente> lista){
        
        try {
            archivo = new FileOutputStream(nomArch+".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            tit.setAlignment(1);
            documento.add(tit);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            
            PdfPTable tb = new PdfPTable(6);
            tb.setWidthPercentage(100);
            PdfPCell cod = new PdfPCell(new Phrase("Codigo"));
            cod.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell nom = new PdfPCell(new Phrase("Nombre"));
            nom.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell stk = new PdfPCell(new Phrase("Stok"));
            stk.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell cat = new PdfPCell(new Phrase("CodigoCat"));
            cat.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell pro = new PdfPCell(new Phrase("CodigoPro"));
            pro.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell ven = new PdfPCell(new Phrase("Vencimiento"));
            ven.setBackgroundColor(BaseColor.ORANGE);
            
            tb.addCell(cod);
            tb.addCell(nom);
            tb.addCell(stk);
            tb.addCell(cat);
            tb.addCell(pro);
            tb.addCell(ven);
            for(Ingrediente x : lista ){
                tb.addCell(x.getCodigo());
                tb.addCell(x.getNombre());
                tb.addCell((String.valueOf(x.getStock())));
                tb.addCell(x.getCodCategoria());
                tb.addCell(x.getCodProveedor());
                tb.addCell(String.valueOf(x.getVencimiento()));
            }
            
            documento.add(tb);
            
            documento.close();
            
            JOptionPane.showMessageDialog(null, "Archivo creado correctamente");

        } catch (DocumentException e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Plantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
