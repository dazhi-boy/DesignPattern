package com.dazhi6.structuralMode.Filter;

import java.util.List;

/**
 * 标准
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
