package cuexpo.cuexpo2017.dao;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoundDao {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("results")
    @Expose
    private List<RoundResult> results = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<RoundResult> getResults() {
        return results;
    }

    public void setResults(List<RoundResult> results) {
        this.results = results;
    }

    public void addResults(RoundResult resultDao){
        this.results.add(resultDao);
    }
}