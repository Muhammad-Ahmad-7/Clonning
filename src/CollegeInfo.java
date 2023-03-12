public class CollegeInfo {
    String collegeName;
    int collegeRank;

    public CollegeInfo(String collegeName, int collegeRank) {
        this.collegeName = collegeName;
        this.collegeRank = collegeRank;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getCollegeRank() {
        return collegeRank;
    }

    public void setCollegeRank(int collegeRank) {
        this.collegeRank = collegeRank;
    }

    @Override
    public String toString() {
        return "CollegeInfo{" +
                "collegeName='" + collegeName + '\'' +
                ", collegeRank=" + collegeRank +
                '}';
    }
    @Override
    public CollegeInfo clone(){
        return new CollegeInfo(this.collegeName, this.collegeRank);
    }
}
