package com.deathrayresearch.outlier;

import com.deathrayresearch.outlier.filter.Filter;
import com.deathrayresearch.outlier.filter.IntEqualTo;
import com.deathrayresearch.outlier.filter.StringEqualTo;

/**
 *
 */
public class ColumnReference {

  private String columnName;

  ColumnReference(String column) {
    this.columnName = column;
  }

  Filter isEqualTo(int value) {
    return new IntEqualTo(this, value);
  }

  Filter isEqualTo(String value) {
    return new StringEqualTo(this, value);
  }

  public String getColumnName() {
    return columnName;
  }
}