package nz.co.trademe.trademebrowser.objects;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by kevin on 19/09/15.
 */
public class OpenHome {

    @SerializedName("Start")
    Date start;

    @SerializedName("End")
    Date end;

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
