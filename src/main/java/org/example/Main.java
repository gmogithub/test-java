package org.example;

import org.example.enums.Module2035StepEnum;
import org.example.enums.Module2035TypeEnum;
import org.example.enums.OdTypeEnum;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;


public class Main {

    public static final BigDecimal BIG_DECIMAL_ONE_HUNDRED = new BigDecimal(100);
    private static final int VAT_PRECISION = 4;

    public static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
        BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(resultingImage, 0, 0, null);
        g2d.dispose();

        return outputImage;
    }


    public static Long computedTTC(Long priceHT, Double vat) {
        BigDecimal vatBigDecimal = BigDecimal.valueOf(vat);
        BigDecimal priceHTBigDecimal = new BigDecimal(priceHT);
        BigDecimal vatBig = BigDecimal.ONE.add(vatBigDecimal.divide(BIG_DECIMAL_ONE_HUNDRED, VAT_PRECISION, RoundingMode.HALF_EVEN));
        System.out.println(priceHTBigDecimal.multiply(vatBig).doubleValue());
        double finalResult = Math.floor(priceHTBigDecimal.multiply(vatBig).doubleValue());


        return BigDecimal.valueOf(finalResult).longValue();
    }

    static void resizeImage() {
        try {
            // Ouvrir l'image
            File inputFile = new File("/home/gmo/Documents/pret voiture/carte grise/FACTURE.jpg");


            BufferedImage inputImage = ImageIO.read(inputFile);

            // Spécifier les dimensions souhaitées
            int targetWidth = (int) (inputImage.getWidth() / 2);
            int targetHeight = (int) (inputImage.getHeight() / 2);

            // Redimensionner l'image
            BufferedImage resizedImage = resizeImage(inputImage, targetWidth, targetHeight);

            // Sauvegarder l'image redimensionnée
            File outputFile = new File("/home/gmo/Documents/pret voiture/carte grise/resize/FACTURE.jpg");
            ImageIO.write(resizedImage, "jpg", outputFile);

            System.out.println("L'image a été redimensionnée et sauvegardée avec succès.");
        } catch (IOException e) {
            System.err.println("Erreur lors de la manipulation de l'image : " + e.getMessage());
        }
    }

    public static void main(String[] args) {


        System.out.println(Pattern.compile("\t")
                .matcher("dkfsl lskdljsdf\tsljflsjd    kjsdlfjsdf")
                .results()
                .count());
//        Long l = 356985L;
//        System.out.println(l.toString().startsWith("2"));
//
//
//        BigDecimal vatPercentageDivided = BigDecimal.valueOf(0).divide(BigDecimal.valueOf(100), 10, RoundingMode.HALF_UP);
//        BigDecimal globalHtAmount = BigDecimal.valueOf(100).divide(vatPercentageDivided, 10, RoundingMode.HALF_UP);

//        Integer test = null;
//
//        if( test == 0 ) {
//            System.out.println("null ou zero");
//        } else {
//            System.out.println("test ");
//        }
//        String str = "\"test\"";
//        System.out.println(str.replace('"', ' ').trim());
//        BigDecimal cal = new BigDecimal(6).divide(new BigDecimal(3), 0, RoundingMode.CEILING);
//
//
//        Random random = new Random();
//        System.out.println(random.nextInt(10000));
//        String input = "été à l'a voiture";
//        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
//        System.out.println(input);
//        System.out.println(normalized);
//        System.out.println(normalized.replaceAll("\\p{M}", ""));
//        System.out.println(new BigDecimal("20,512".replace(",", ".")).setScale(2, RoundingMode.HALF_EVEN).doubleValue());
//        System.out.println(cal.intValue());

//        System.out.println(" start main");
//
//        Arrays.stream(Module2035TypeEnum.values()).forEach(module2035TypeEnum -> {
//            System.out.println("=============================");
//            System.out.println("=============================");
//            System.out.println("=============================");
//            System.out.println("=============================");
//            System.out.println(module2035TypeEnum.ordinal());
//            System.out.println(module2035TypeEnum.name());
//            System.out.println(module2035TypeEnum.getTitle());
//            System.out.println(module2035TypeEnum.getOrder());
//            System.out.println(module2035TypeEnum.getOdTypes());
//            System.out.println(module2035TypeEnum.getDeps());
//            System.out.println(module2035TypeEnum.getStepType());
//        });

//        resizeImage();
//        Module2035Deps deps = new Module2035Deps();
//        List<Module2035TypeEnum> types = Module2035Deps.BIC;


//        OrderModule2035ByStep.YEAR_END_RESTATEMENTS.CNBF.ordinal();


//   LocalDate now = LocalDate.now();
//        LocalDate fromDate = LocalDate.of(2024, 3, 22);
//
//        long days = ChronoUnit.DAYS.between(fromDate,now );
//        System.out.println(days);
//        ArrayList<Integer> originalList = new ArrayList<>();
//
//        originalList.add(1);
//        originalList.add(2);
//        originalList.add(3);
//        originalList.add(4);
//
//        // Création d'une nouvelle ArrayList en supprimant le premier élément
//        List<Integer> newList = originalList.subList(1, originalList.size());
//
//        // Affichage de la nouvelle liste
//        System.out.println("Ancienne liste avant suppression du premier élément : " + originalList);
//        System.out.println("Nouvelle liste après suppression du premier élément : " + newList);

//        String str = Arrays.stream(OdTypeEnum.values()).reduce("", ((acc, odTypeEnum) -> {
//           if(odTypeEnum.name().startsWith("MODULE_2035_")) {
//               return  acc + ", " + odTypeEnum.getId();
//           }
//           return acc;
//        }), (a,b) -> new String());
////
//        System.out.println(str);

//
//        Arrays.stream(Module2035StepEnum.values()).forEach(odTypeEnum -> {
//            System.out.println(odTypeEnum.name() + "='" + odTypeEnum.name()+ "',");
//        });

      /*       String str1 = "00 , 446 1";
        String str2 = "99 , 14";

        String res = TestFunctionCallback.applyFunction("test", (str) -> {

            List<String> strs = Arrays.asList(str2.split(" "));
            Collections.reverse(strs);
            System.out.println(strs);
            String result = strs.stream().reduce("", (acc, string) -> {
                String r = string.trim();
                if(!r.isEmpty()) {
                    acc += r;
                }
                return acc;
            },(a,b) -> "");
            return result;
        });
        System.out.println(str1 + " => " + res);*/

//        Double d = 18260.55;
//        System.out.println(Math.floor(d));
//        System.out.println(computedTTC(1416L, 20.0));
//        LocalDate now = LocalDate.of(2024, 1, 22);
//        LocalDate endDate = LocalDate.of(2023, 12, 22);
//        endDate = now.withDayOfMonth(endDate.getDayOfMonth());
//        if (now.getDayOfMonth() >= endDate.getDayOfMonth()) {
//            System.out.println("========================");
//            endDate = endDate.plusMonths(1);
//        } else if (now.getDayOfMonth() < endDate.getDayOfMonth()
//                && now.getMonthValue() > endDate.getMonthValue()) {
//            endDate = endDate.withMonth(now.getMonthValue());
//        }
//
//        System.out.println(endDate);

        List<String> list = new java.util.ArrayList<>(List.of("test"));
        list.add("test2");
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        try {
            Package[] packages = classLoader.getDefinedPackages();

            for (Package pkg : packages) {
//                System.out.println(pkg);
            }
//            Arrays.stream(classLoader.getDefinedPackages()).forEach(p -> {
//                System.out.println(p.getName());
//                for (Annotation annotation : p.getAnnotations()) {
//                    System.out.println(annotation.getClass().getName());
//                }
//            });
//            Class<?> clazz = classLoader.loadClass("org.example.entity.Test");
//            System.out.println(clazz.isAnnotationPresent(org.example.annotation.Test.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
