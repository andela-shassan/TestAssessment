
package www.nobestdev.com.testassessment.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("hot")
    @Expose
    private boolean hot;
    @SerializedName("unreviewed_annotations")
    @Expose
    private int unreviewedAnnotations;
    @SerializedName("pageviews")
    @Expose
    private int pageviews;

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public int getUnreviewedAnnotations() {
        return unreviewedAnnotations;
    }

    public void setUnreviewedAnnotations(int unreviewedAnnotations) {
        this.unreviewedAnnotations = unreviewedAnnotations;
    }

    public int getPageviews() {
        return pageviews;
    }

    public void setPageviews(int pageviews) {
        this.pageviews = pageviews;
    }

}
