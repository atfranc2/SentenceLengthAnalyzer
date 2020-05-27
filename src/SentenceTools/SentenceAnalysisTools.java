package SentenceTools;

public abstract class SentenceAnalysisTools {

    public String generateRegex(String[] delimiters){
        String regex = "";
        int numberOfDelimiters = delimiters.length;
        int count = 1;

        for (String delimiter : delimiters) {

            if (numberOfDelimiters == 1)
                regex = "\\" + delimiter;
            else if (count == 1)
                regex = "\\" + delimiter + "|\\";
            else if (count != numberOfDelimiters)
                regex = regex + delimiter + "|\\";
            else
                regex = regex + delimiter;

            count++;
        }

        return regex;

    }

    public int countWordsInSentence(String sentence){
        String[] wordArray = sentence.split(" ");
        return wordArray.length;
    }

    public int countLettersInWord(String word){
        String[] letterArray = word.split("");
        return letterArray.length;
    }

    public String[] removePunctuation(String[] sentences){
        int numberOfSentences = sentences.length;
        String[] cleanedSentences = new String[numberOfSentences];
        int index = 0;

        for (String sentence : sentences){
            cleanedSentences[index] = sentence.replaceAll("'|;|,|-|\\[|\\]|\\{|\\|\\.|\\?|\\:|\\!|\\,}", "");
            index++;
        }

        return cleanedSentences;
    }

}
