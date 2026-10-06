public class StudyRecommendation implements RecommendationEngine {

    private double progress;

    public StudyRecommendation(double progress) {
        this.progress = progress;
    }

    @Override
    public String generateRecommendation() {

        if (progress < 40) {
            return "Give this subject additional study time.";
        } else if (progress < 70) {
            return "Continue regular practice.";
        } else {
            return "Good progress. Keep it up.";
        }
    }
}