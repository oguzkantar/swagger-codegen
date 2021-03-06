package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;


/**
 * Model for testing reserved words
 */
@ApiModel(description = "Model for testing reserved words")
public class ModelReturn   {
    @SerializedName("return")
    private Integer _return = null;

    /**
     * Get _return
     * @return _return
     **/
    @ApiModelProperty(value = "")
    public Integer getReturn() {
        return _return;
    }

    /**
     * Set _return
     *
     * @param _return _return
     */
    public void setReturn(Integer _return) {
        this._return = _return;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelReturn _return = (ModelReturn) o;
        return Objects.equals(this._return, _return._return);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_return);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelReturn {\n");
        
        sb.append("    _return: ").append(toIndentedString(_return)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     *
     * @param o Object to be converted to indented string
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

