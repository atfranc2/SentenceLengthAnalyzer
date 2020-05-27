package SentenceTools;

public interface MeasureSentencesInterface {
    float calculateAverageSentenceLength(int exclusionLength);
    void setSentenceDelimiters(String[] delimiters);
    void setFileContent(String fileContent);
}
