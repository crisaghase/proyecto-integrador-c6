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
import java.sql.Date;
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
    String fecha;
    Document documento;
    FileOutputStream archivo;
    Paragraph tit;

    public Plantilla(String titulo, String fecha) {
        this.titulo = titulo;
        this.fecha = fecha;
        documento = new Document();
        tit = new Paragraph(this.titulo);
    }
    
  
    public void crearPlantillaIngrediente(String nomArch, List<Ingrediente> lista){
        
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
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: "+fecha));
            documento.close();
            
            JOptionPane.showMessageDialog(null, "Archivo creado correctamente");

        } catch (DocumentException e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Plantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearPlantillaIngreso(String nomArch, List<Ingreso> lista,int ingVen, int ingRe){
        
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
            cod.setBackgroundColor(BaseColor.MAGENTA);
            PdfPCell pro = new PdfPCell(new Phrase("Producto"));
            pro.setBackgroundColor(BaseColor.MAGENTA);
            PdfPCell nom = new PdfPCell(new Phrase("Nombre"));
            nom.setBackgroundColor(BaseColor.MAGENTA);
            PdfPCell can = new PdfPCell(new Phrase("Cantidad"));
            can.setBackgroundColor(BaseColor.MAGENTA);
            PdfPCell ven = new PdfPCell(new Phrase("Vencimiento"));
            ven.setBackgroundColor(BaseColor.MAGENTA);
            PdfPCell ing = new PdfPCell(new Phrase("Ingreso"));
            ing.setBackgroundColor(BaseColor.MAGENTA);
            
            tb.addCell(cod);
            tb.addCell(pro);
            tb.addCell(nom);
            tb.addCell(can);
            tb.addCell(ven);
            tb.addCell(ing);
            for(Ingreso x : lista ){
                tb.addCell(x.getCodigo());
                tb.addCell(x.getCodigoProducto());
                tb.addCell(x.getNombre_ingrediente());
                tb.addCell((String.valueOf(x.getCantidad())));
                tb.addCell((String.valueOf(x.getVencimiento())));
                tb.addCell((String.valueOf(x.getIngreso())));
            }
            
            documento.add(tb);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Ingresos Vencidos: "+ingVen));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Cantidad de ingresos Realizados: "+ingRe));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: "+fecha));
            documento.close();
            
            JOptionPane.showMessageDialog(null, "Archivo creado correctamente");

        } catch (DocumentException e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Plantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearPlantillaHistorial(String nomArch, List<HistorialReceta> lista){
        
        try {
            archivo = new FileOutputStream(nomArch+".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            tit.setAlignment(1);
            documento.add(tit);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            
            PdfPTable tb = new PdfPTable(3);
            tb.setWidthPercentage(100);
            PdfPCell cod = new PdfPCell(new Phrase("Codigo"));
            cod.setBackgroundColor(BaseColor.PINK);
            PdfPCell nom = new PdfPCell(new Phrase("Nombre del Pastel"));
            nom.setBackgroundColor(BaseColor.PINK);
            PdfPCell fec = new PdfPCell(new Phrase("Fecha de Preparación"));
            fec.setBackgroundColor(BaseColor.PINK);

            tb.addCell(cod);
            tb.addCell(nom);
            tb.addCell(fec);

            for(HistorialReceta x : lista ){
                tb.addCell(x.getCodigoReceta());
                tb.addCell(x.getNombrePastel());
                tb.addCell(x.getFechaPreparacion());
            }
            
            documento.add(tb);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: "+fecha));
            documento.close();
            
            JOptionPane.showMessageDialog(null, "Archivo creado correctamente");

        } catch (DocumentException e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Plantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
