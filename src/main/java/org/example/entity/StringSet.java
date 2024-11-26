package org.example.entity;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StringSet {

    public static Set<String> findUniqueWords() {
        // Verilen metni bir String değişkenine atama
        String text = "Carroll began writing the manuscript of the story the next day, although that earliest version is lost. " +
                "The girls and Carroll took another boat trip a month later, when he elaborated the plot to the story of Alice, " +
                "and in November he began working on the manuscript in earnest. To add the finishing touches he researched " +
                "natural history in connection with the animals presented in the book and then had the book examined " +
                "by other children—particularly those of George MacDonald. Though Carroll did add his own illustrations " +
                "to the original copy, on publication he was advised to find a professional illustrator so the pictures " +
                "were more appealing to its audiences. He subsequently approached John Tenniel to reinterpret " +
                "Carroll's visions through his own artistic eye, telling him that the story had been well liked by the" +
                " children.\n\n" +
                "Carroll began planning a print edition of the Alice story in 1863. " +
                "He wrote on 9 May 1863 that MacDonald's family had suggested he publish Alice." +
                " A diary entry for 2 July says that he received a specimen page of the print edition around that date. " +
                "On 26 November 1864, Carroll gave Alice the manuscript of Alice's Adventures Under Ground, with illustrations " +
                "by Carroll, dedicating it as " +"A Christmas Gift to a Dear Child in Memory of a Summer's Day."+
                " The published version of Alice's Adventures in Wonderland is about twice the length of " +
                "Alice's Adventures Under Ground and includes episodes, such as the Mad Tea-Party, " +
                "that did not appear in the manuscript. The only known manuscript copy of Under Ground " +
                "is held in the British Library. Macmillan published a facsimile of the manuscript in 1886.";

        // Noktalama işaretlerini ve sayıları temizleme, küçük harfe çevirme
        text = text.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();

        // Kelimeleri ayırma ve unique kelimeleri TreeSet ile alfabetik olarak sıralama
        Set<String> uniqueWords = Arrays.stream(text.split("\\s+"))
                .filter(word -> !word.isEmpty())  // Boş stringleri hariç tut
                .collect(Collectors.toCollection(TreeSet::new));

        return uniqueWords;
    }

    // Main metod test etmek için
    public static void main(String[] args) {
        Set<String> uniqueWords = findUniqueWords();
        System.out.println("Unique Kelime Sayısı: " + uniqueWords.size());
        System.out.println("Unique Kelimeler (Alfabetik Sırada):");
        uniqueWords.forEach(System.out::println);
    }
}