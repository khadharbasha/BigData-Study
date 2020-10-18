// ORM class for table 'custmaster'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Sep 19 10:18:09 IST 2020
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

public class custmaster extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public custmaster with_id(Integer id) {
    this.id = id;
    return this;
  }
  private String fname;
  public String get_fname() {
    return fname;
  }
  public void set_fname(String fname) {
    this.fname = fname;
  }
  public custmaster with_fname(String fname) {
    this.fname = fname;
    return this;
  }
  private String lname;
  public String get_lname() {
    return lname;
  }
  public void set_lname(String lname) {
    this.lname = lname;
  }
  public custmaster with_lname(String lname) {
    this.lname = lname;
    return this;
  }
  private Integer ageval;
  public Integer get_ageval() {
    return ageval;
  }
  public void set_ageval(Integer ageval) {
    this.ageval = ageval;
  }
  public custmaster with_ageval(Integer ageval) {
    this.ageval = ageval;
    return this;
  }
  private String profession;
  public String get_profession() {
    return profession;
  }
  public void set_profession(String profession) {
    this.profession = profession;
  }
  public custmaster with_profession(String profession) {
    this.profession = profession;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof custmaster)) {
      return false;
    }
    custmaster that = (custmaster) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.fname == null ? that.fname == null : this.fname.equals(that.fname));
    equal = equal && (this.lname == null ? that.lname == null : this.lname.equals(that.lname));
    equal = equal && (this.ageval == null ? that.ageval == null : this.ageval.equals(that.ageval));
    equal = equal && (this.profession == null ? that.profession == null : this.profession.equals(that.profession));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof custmaster)) {
      return false;
    }
    custmaster that = (custmaster) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.fname == null ? that.fname == null : this.fname.equals(that.fname));
    equal = equal && (this.lname == null ? that.lname == null : this.lname.equals(that.lname));
    equal = equal && (this.ageval == null ? that.ageval == null : this.ageval.equals(that.ageval));
    equal = equal && (this.profession == null ? that.profession == null : this.profession.equals(that.profession));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fname = JdbcWritableBridge.readString(2, __dbResults);
    this.lname = JdbcWritableBridge.readString(3, __dbResults);
    this.ageval = JdbcWritableBridge.readInteger(4, __dbResults);
    this.profession = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fname = JdbcWritableBridge.readString(2, __dbResults);
    this.lname = JdbcWritableBridge.readString(3, __dbResults);
    this.ageval = JdbcWritableBridge.readInteger(4, __dbResults);
    this.profession = JdbcWritableBridge.readString(5, __dbResults);
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
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fname, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(lname, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(ageval, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(profession, 5 + __off, 12, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fname, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(lname, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(ageval, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(profession, 5 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fname = null;
    } else {
    this.fname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lname = null;
    } else {
    this.lname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ageval = null;
    } else {
    this.ageval = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.profession = null;
    } else {
    this.profession = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.fname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fname);
    }
    if (null == this.lname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lname);
    }
    if (null == this.ageval) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ageval);
    }
    if (null == this.profession) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, profession);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.fname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fname);
    }
    if (null == this.lname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lname);
    }
    if (null == this.ageval) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ageval);
    }
    if (null == this.profession) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, profession);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fname==null?"null":fname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lname==null?"null":lname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ageval==null?"null":"" + ageval, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(profession==null?"null":profession, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fname==null?"null":fname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lname==null?"null":lname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ageval==null?"null":"" + ageval, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(profession==null?"null":profession, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.fname = null; } else {
      this.fname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.lname = null; } else {
      this.lname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ageval = null; } else {
      this.ageval = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.profession = null; } else {
      this.profession = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.fname = null; } else {
      this.fname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.lname = null; } else {
      this.lname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ageval = null; } else {
      this.ageval = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.profession = null; } else {
      this.profession = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    custmaster o = (custmaster) super.clone();
    return o;
  }

  public void clone0(custmaster o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("fname", this.fname);
    __sqoop$field_map.put("lname", this.lname);
    __sqoop$field_map.put("ageval", this.ageval);
    __sqoop$field_map.put("profession", this.profession);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("fname", this.fname);
    __sqoop$field_map.put("lname", this.lname);
    __sqoop$field_map.put("ageval", this.ageval);
    __sqoop$field_map.put("profession", this.profession);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("fname".equals(__fieldName)) {
      this.fname = (String) __fieldVal;
    }
    else    if ("lname".equals(__fieldName)) {
      this.lname = (String) __fieldVal;
    }
    else    if ("ageval".equals(__fieldName)) {
      this.ageval = (Integer) __fieldVal;
    }
    else    if ("profession".equals(__fieldName)) {
      this.profession = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
      return true;
    }
    else    if ("fname".equals(__fieldName)) {
      this.fname = (String) __fieldVal;
      return true;
    }
    else    if ("lname".equals(__fieldName)) {
      this.lname = (String) __fieldVal;
      return true;
    }
    else    if ("ageval".equals(__fieldName)) {
      this.ageval = (Integer) __fieldVal;
      return true;
    }
    else    if ("profession".equals(__fieldName)) {
      this.profession = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
