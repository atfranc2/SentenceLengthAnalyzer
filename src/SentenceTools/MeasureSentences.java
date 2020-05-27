package SentenceTools;

public class MeasureSentences extends SentenceAnalysisTools implements MeasureSentencesInterface{

    private String[] sentenceDelimiters;
    private String fileContent;

    private int[] sentenceLengthArray(String[] sentences){
        int numberOfSentences = sentences.length;
        int[] sentenceLengthArray = new int[numberOfSentences];
        int index = 0;

        for (String sentence : sentences) {
            String[] parsedSentence = sentence.split(" ");
            sentenceLengthArray[index] = parsedSentence.length;
            index++;
        }
        return sentenceLengthArray;

    }

    private int[] parseSentence(){
        String regexExpression = generateRegex(sentenceDelimiters);
        String[] fileSentences = fileContent.split(regexExpression);
        String[] fileContentWithoutPunctuation = removePunctuation(fileSentences);
        int[] sentenceLengths = sentenceLengthArray(fileContentWithoutPunctuation);
        return sentenceLengths;
    }

    @Override
    public float calculateAverageSentenceLength(int exclusionLength){
        int numberOfElements = 0;
        int sumOfElements = 0;
        int[] sentenceLengthArray = parseSentence();

        for (int sentenceLength : sentenceLengthArray){
            if (sentenceLength>exclusionLength){
                numberOfElements++;
                sumOfElements = sumOfElements + sentenceLength;
            }
        }

        float averageLength = sumOfElements / numberOfElements;
        return averageLength;
    }

    @Override
    public void setSentenceDelimiters(String[] delimiters){
        this.sentenceDelimiters = delimiters;
    }

    @Override
    public void setFileContent(String fileContent){
        this.fileContent = fileContent;
    }

}
