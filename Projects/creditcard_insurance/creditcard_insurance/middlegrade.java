// ORM class for table 'middlegrade'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Sep 19 10:10:58 IST 2020
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class middlegrade extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer issuerid;
  public Integer get_issuerid() {
    return issuerid;
  }
  public void set_issuerid(Integer issuerid) {
    this.issuerid = issuerid;
  }
  public middlegrade with_issuerid(Integer issuerid) {
    this.issuerid = issuerid;
    return this;
  }
  private Integer businessyear;
  public Integer get_businessyear() {
    return businessyear;
  }
  public void set_businessyear(Integer businessyear) {
    this.businessyear = businessyear;
  }
  public middlegrade with_businessyear(Integer businessyear) {
    this.businessyear = businessyear;
    return this;
  }
  private String maskedstatedesc;
  public String get_maskedstatedesc() {
    return maskedstatedesc;
  }
  public void set_maskedstatedesc(String maskedstatedesc) {
    this.maskedstatedesc = maskedstatedesc;
  }
  public middlegrade with_maskedstatedesc(String maskedstatedesc) {
    this.maskedstatedesc = maskedstatedesc;
    return this;
  }
  private String maskedsourcename;
  public String get_maskedsourcename() {
    return maskedsourcename;
  }
  public void set_maskedsourcename(String maskedsourcename) {
    this.maskedsourcename = maskedsourcename;
  }
  public middlegrade with_maskedsourcename(String maskedsourcename) {
    this.maskedsourcename = maskedsourcename;
    return this;
  }
  private String defaulter;
  public String get_defaulter() {
    return defaulter;
  }
  public void set_defaulter(String defaulter) {
    this.defaulter = defaulter;
  }
  public middlegrade with_defaulter(String defaulter) {
    this.defaulter = defaulter;
    return this;
  }
  private String maskednetworkurl;
  public String get_maskednetworkurl() {
    return maskednetworkurl;
  }
  public void set_maskednetworkurl(String maskednetworkurl) {
    this.maskednetworkurl = maskednetworkurl;
  }
  public middlegrade with_maskednetworkurl(String maskednetworkurl) {
    this.maskednetworkurl = maskednetworkurl;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof middlegrade)) {
      return false;
    }
    middlegrade that = (middlegrade) o;
    boolean equal = true;
    equal = equal && (this.issuerid == null ? that.issuerid == null : this.issuerid.equals(that.issuerid));
    equal = equal && (this.businessyear == null ? that.businessyear == null : this.businessyear.equals(that.businessyear));
    equal = equal && (this.maskedstatedesc == null ? that.maskedstatedesc == null : this.maskedstatedesc.equals(that.maskedstatedesc));
    equal = equal && (this.maskedsourcename == null ? that.maskedsourcename == null : this.maskedsourcename.equals(that.maskedsourcename));
    equal = equal && (this.defaulter == null ? that.defaulter == null : this.defaulter.equals(that.defaulter));
    equal = equal && (this.maskednetworkurl == null ? that.maskednetworkurl == null : this.maskednetworkurl.equals(that.maskednetworkurl));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof middlegrade)) {
      return false;
    }
    middlegrade that = (middlegrade) o;
    boolean equal = true;
    equal = equal && (this.issuerid == null ? that.issuerid == null : this.issuerid.equals(that.issuerid));
    equal = equal && (this.businessyear == null ? that.businessyear == null : this.businessyear.equals(that.businessyear));
    equal = equal && (this.maskedstatedesc == null ? that.maskedstatedesc == null : this.maskedstatedesc.equals(that.maskedstatedesc));
    equal = equal && (this.maskedsourcename == null ? that.maskedsourcename == null : this.maskedsourcename.equals(that.maskedsourcename));
    equal = equal && (this.defaulter == null ? that.defaulter == null : this.defaulter.equals(that.defaulter));
    equal = equal && (this.maskednetworkurl == null ? that.maskednetworkurl == null : this.maskednetworkurl.equals(that.maskednetworkurl));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.issuerid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.businessyear = JdbcWritableBridge.readInteger(2, __dbResults);
    this.maskedstatedesc = JdbcWritableBridge.readString(3, __dbResults);
    this.maskedsourcename = JdbcWritableBridge.readString(4, __dbResults);
    this.defaulter = JdbcWritableBridge.readString(5, __dbResults);
    this.maskednetworkurl = JdbcWritableBridge.readString(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.issuerid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.businessyear = JdbcWritableBridge.readInteger(2, __dbResults);
    this.maskedstatedesc = JdbcWritableBridge.readString(3, __dbResults);
    this.maskedsourcename = JdbcWritableBridge.readString(4, __dbResults);
    this.defaulter = JdbcWritableBridge.readString(5, __dbResults);
    this.maskednetworkurl = JdbcWritableBridge.readString(6, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(issuerid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(businessyear, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(maskedstatedesc, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(maskedsourcename, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(defaulter, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(maskednetworkurl, 6 + __off, 12, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(issuerid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(businessyear, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(maskedstatedesc, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(maskedsourcename, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(defaulter, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(maskednetworkurl, 6 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.issuerid = null;
    } else {
    this.issuerid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.businessyear = null;
    } else {
    this.businessyear = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.maskedstatedesc = null;
    } else {
    this.maskedstatedesc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.maskedsourcename = null;
    } else {
    this.maskedsourcename = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.defaulter = null;
    } else {
    this.defaulter = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.maskednetworkurl = null;
    } else {
    this.maskednetworkurl = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.issuerid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.issuerid);
    }
    if (null == this.businessyear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.businessyear);
    }
    if (null == this.maskedstatedesc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, maskedstatedesc);
    }
    if (null == this.maskedsourcename) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, maskedsourcename);
    }
    if (null == this.defaulter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, defaulter);
    }
    if (null == this.maskednetworkurl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, maskednetworkurl);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.issuerid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.issuerid);
    }
    if (null == this.businessyear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.businessyear);
    }
    if (null == this.maskedstatedesc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, maskedstatedesc);
    }
    if (null == this.maskedsourcename) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, maskedsourcename);
    }
    if (null == this.defaulter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, defaulter);
    }
    if (null == this.maskednetworkurl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, maskednetworkurl);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 124, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(issuerid==null?"null":"" + issuerid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(businessyear==null?"null":"" + businessyear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maskedstatedesc==null?"null":maskedstatedesc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maskedsourcename==null?"null":maskedsourcename, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(defaulter==null?"null":defaulter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maskednetworkurl==null?"null":maskednetworkurl, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(issuerid==null?"null":"" + issuerid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(businessyear==null?"null":"" + businessyear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maskedstatedesc==null?"null":maskedstatedesc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maskedsourcename==null?"null":maskedsourcename, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(defaulter==null?"null":defaulter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maskednetworkurl==null?"null":maskednetworkurl, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 124, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.issuerid = null; } else {
      this.issuerid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.businessyear = null; } else {
      this.businessyear = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.maskedstatedesc = null; } else {
      this.maskedstatedesc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.maskedsourcename = null; } else {
      this.maskedsourcename = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.defaulter = null; } else {
      this.defaulter = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.maskednetworkurl = null; } else {
      this.maskednetworkurl = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.issuerid = null; } else {
      this.issuerid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.businessyear = null; } else {
      this.businessyear = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.maskedstatedesc = null; } else {
      this.maskedstatedesc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.maskedsourcename = null; } else {
      this.maskedsourcename = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.defaulter = null; } else {
      this.defaulter = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.maskednetworkurl = null; } else {
      this.maskednetworkurl = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    middlegrade o = (middlegrade) super.clone();
    return o;
  }

  public void clone0(middlegrade o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("issuerid", this.issuerid);
    __sqoop$field_map.put("businessyear", this.businessyear);
    __sqoop$field_map.put("maskedstatedesc", this.maskedstatedesc);
    __sqoop$field_map.put("maskedsourcename", this.maskedsourcename);
    __sqoop$field_map.put("defaulter", this.defaulter);
    __sqoop$field_map.put("maskednetworkurl", this.maskednetworkurl);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("issuerid", this.issuerid);
    __sqoop$field_map.put("businessyear", this.businessyear);
    __sqoop$field_map.put("maskedstatedesc", this.maskedstatedesc);
    __sqoop$field_map.put("maskedsourcename", this.maskedsourcename);
    __sqoop$field_map.put("defaulter", this.defaulter);
    __sqoop$field_map.put("maskednetworkurl", this.maskednetworkurl);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("issuerid".equals(__fieldName)) {
      this.issuerid = (Integer) __fieldVal;
    }
    else    if ("businessyear".equals(__fieldName)) {
      this.businessyear = (Integer) __fieldVal;
    }
    else    if ("maskedstatedesc".equals(__fieldName)) {
      this.maskedstatedesc = (String) __fieldVal;
    }
    else    if ("maskedsourcename".equals(__fieldName)) {
      this.maskedsourcename = (String) __fieldVal;
    }
    else    if ("defaulter".equals(__fieldName)) {
      this.defaulter = (String) __fieldVal;
    }
    else    if ("maskednetworkurl".equals(__fieldName)) {
      this.maskednetworkurl = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("issuerid".equals(__fieldName)) {
      this.issuerid = (Integer) __fieldVal;
      return true;
    }
    else    if ("businessyear".equals(__fieldName)) {
      this.businessyear = (Integer) __fieldVal;
      return true;
    }
    else    if ("maskedstatedesc".equals(__fieldName)) {
      this.maskedstatedesc = (String) __fieldVal;
      return true;
    }
    else    if ("maskedsourcename".equals(__fieldName)) {
      this.maskedsourcename = (String) __fieldVal;
      return true;
    }
    else    if ("defaulter".equals(__fieldName)) {
      this.defaulter = (String) __fieldVal;
      return true;
    }
    else    if ("maskednetworkurl".equals(__fieldName)) {
      this.maskednetworkurl = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
