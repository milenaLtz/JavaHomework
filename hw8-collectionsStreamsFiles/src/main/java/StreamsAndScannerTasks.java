import org.apache.tools.ant.util.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsAndScannerTasks {

    public static long calcWordsCount(File inputFile) {
        try {
            if (inputFile == null || inputFile.length() == 0) {
                throw new RuntimeException();
            }
            Scanner scan = new Scanner(inputFile);
            scan.useDelimiter("\\s+");
            return  scan.tokens().count();
        } catch (RuntimeException | FileNotFoundException e) {
            throw new RuntimeException("Failed to load file");
        }
    }

    public static long calcWordsCountWithoutStopWords(File inputFile, File stopWords) {
        try {
            if (inputFile.length() == 0) {
                throw new RuntimeException();
            } else if (stopWords.length() == 0) {
                throw new RuntimeException();
            }
            Scanner scan = new Scanner(inputFile);
            List<String> lst = new Scanner(stopWords)
                    .tokens()
                    .toList();
            return scan.tokens().filter(i -> !lst.contains(i.toLowerCase())).count();
        } catch (RuntimeException | FileNotFoundException e) {
            throw new RuntimeException("Failed to load file");
        }

    }

    public static long calcWordsCountWithUpperCaseFirstLetter(File inputFile) throws Exception {
        try {
            if (inputFile.length() == 0 || inputFile == null) {
                throw new RuntimeException();
            }
            Scanner scan = new Scanner(inputFile);
            scan.useDelimiter("[A-Z][a-zA-Z0-9]");
            return  scan.tokens().count();
        } catch (RuntimeException | FileNotFoundException e) {
            throw new RuntimeException("Failed to load file");
        }
    }

    public static Map<String, Double> calcWordsStatistic(File inputFile) {
        try {
            if (inputFile.length() == 0 || inputFile == null) {
                throw new RuntimeException();
            }
            DoubleSummaryStatistics sum = new Scanner(inputFile)
                    .tokens()
                    .collect(Collectors.summarizingDouble(String::length));
            Map<String, Double> newMap = new HashMap<>();
            newMap.put("average_length", sum.getAverage());
            newMap.put("min_length", sum.getMin());
            newMap.put("max_length", sum.getMax());
            return newMap;
        } catch (RuntimeException | FileNotFoundException e) {
            throw new RuntimeException("Failed to load file");
        }
    }

    public static Map<String, Integer> calcWordsFrequency(File inputFile) {
        try {
            if (inputFile == null || inputFile.length() == 0) {
                throw new RuntimeException();
            }
            List<String> lst = new Scanner(inputFile)
                    .tokens()
                    .toList();
            Map<String, Integer> newMap = lst.stream().map(i -> i.toLowerCase())
                    .collect(Collectors.toConcurrentMap(i -> i, i -> 1, Integer::sum));
            return newMap;
        } catch (RuntimeException | FileNotFoundException e) {
            throw new RuntimeException("Failed to load file");
        }

    }
}
