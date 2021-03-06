package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;

import com.google.gson.annotations.SerializedName;


/**
 * FormatTest
 */
public class FormatTest   {
    @SerializedName("integer")
    private Integer integer = null;
    @SerializedName("int32")
    private Integer int32 = null;
    @SerializedName("int64")
    private Long int64 = null;
    @SerializedName("number")
    private BigDecimal number = null;
    @SerializedName("float")
    private Float _float = null;
    @SerializedName("double")
    private Double _double = null;
    @SerializedName("string")
    private String string = null;
    @SerializedName("byte")
    private byte[] _byte = null;
    @SerializedName("binary")
    private byte[] binary = null;
    @SerializedName("date")
    private Date date = null;
    @SerializedName("dateTime")
    private Date dateTime = null;
    @SerializedName("uuid")
    private String uuid = null;
    @SerializedName("password")
    private String password = null;

    /**
     * Get integer
     * minimum: 10.0
     * maximum: 100.0
     * @return integer
     **/
    @ApiModelProperty(value = "")
    public Integer getInteger() {
        return integer;
    }

    /**
     * Set integer
     *
     * @param integer integer
     */
    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    /**
     * Get int32
     * minimum: 20.0
     * maximum: 200.0
     * @return int32
     **/
    @ApiModelProperty(value = "")
    public Integer getInt32() {
        return int32;
    }

    /**
     * Set int32
     *
     * @param int32 int32
     */
    public void setInt32(Integer int32) {
        this.int32 = int32;
    }

    /**
     * Get int64
     * @return int64
     **/
    @ApiModelProperty(value = "")
    public Long getInt64() {
        return int64;
    }

    /**
     * Set int64
     *
     * @param int64 int64
     */
    public void setInt64(Long int64) {
        this.int64 = int64;
    }

    /**
     * Get number
     * minimum: 32.1
     * maximum: 543.2
     * @return number
     **/
    @ApiModelProperty(required = true, value = "")
    public BigDecimal getNumber() {
        return number;
    }

    /**
     * Set number
     *
     * @param number number
     */
    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    /**
     * Get _float
     * minimum: 54.3
     * maximum: 987.6
     * @return _float
     **/
    @ApiModelProperty(value = "")
    public Float getFloat() {
        return _float;
    }

    /**
     * Set _float
     *
     * @param _float _float
     */
    public void setFloat(Float _float) {
        this._float = _float;
    }

    /**
     * Get _double
     * minimum: 67.8
     * maximum: 123.4
     * @return _double
     **/
    @ApiModelProperty(value = "")
    public Double getDouble() {
        return _double;
    }

    /**
     * Set _double
     *
     * @param _double _double
     */
    public void setDouble(Double _double) {
        this._double = _double;
    }

    /**
     * Get string
     * @return string
     **/
    @ApiModelProperty(value = "")
    public String getString() {
        return string;
    }

    /**
     * Set string
     *
     * @param string string
     */
    public void setString(String string) {
        this.string = string;
    }

    /**
     * Get _byte
     * @return _byte
     **/
    @ApiModelProperty(required = true, value = "")
    public byte[] getByte() {
        return _byte;
    }

    /**
     * Set _byte
     *
     * @param _byte _byte
     */
    public void setByte(byte[] _byte) {
        this._byte = _byte;
    }

    /**
     * Get binary
     * @return binary
     **/
    @ApiModelProperty(value = "")
    public byte[] getBinary() {
        return binary;
    }

    /**
     * Set binary
     *
     * @param binary binary
     */
    public void setBinary(byte[] binary) {
        this.binary = binary;
    }

    /**
     * Get date
     * @return date
     **/
    @ApiModelProperty(required = true, value = "")
    public Date getDate() {
        return date;
    }

    /**
     * Set date
     *
     * @param date date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Get dateTime
     * @return dateTime
     **/
    @ApiModelProperty(value = "")
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * Set dateTime
     *
     * @param dateTime dateTime
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Get uuid
     * @return uuid
     **/
    @ApiModelProperty(value = "")
    public String getUuid() {
        return uuid;
    }

    /**
     * Set uuid
     *
     * @param uuid uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * Get password
     * @return password
     **/
    @ApiModelProperty(required = true, value = "")
    public String getPassword() {
        return password;
    }

    /**
     * Set password
     *
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FormatTest formatTest = (FormatTest) o;
        return Objects.equals(this.integer, formatTest.integer) &&
        Objects.equals(this.int32, formatTest.int32) &&
        Objects.equals(this.int64, formatTest.int64) &&
        Objects.equals(this.number, formatTest.number) &&
        Objects.equals(this._float, formatTest._float) &&
        Objects.equals(this._double, formatTest._double) &&
        Objects.equals(this.string, formatTest.string) &&
        Objects.equals(this._byte, formatTest._byte) &&
        Objects.equals(this.binary, formatTest.binary) &&
        Objects.equals(this.date, formatTest.date) &&
        Objects.equals(this.dateTime, formatTest.dateTime) &&
        Objects.equals(this.uuid, formatTest.uuid) &&
        Objects.equals(this.password, formatTest.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer, int32, int64, number, _float, _double, string, _byte, binary, date, dateTime, uuid, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FormatTest {\n");
        
        sb.append("    integer: ").append(toIndentedString(integer)).append("\n");
        sb.append("    int32: ").append(toIndentedString(int32)).append("\n");
        sb.append("    int64: ").append(toIndentedString(int64)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
        sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
        sb.append("    string: ").append(toIndentedString(string)).append("\n");
        sb.append("    _byte: ").append(toIndentedString(_byte)).append("\n");
        sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

