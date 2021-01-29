package com.datacompanies.dao;

import java.util.List;

import com.datacompanies.beans.BeanException;
import com.datacompanies.beans.AnnualAccount;

public interface AnnualAccountDao {

    List<AnnualAccount> listener() throws BeanException;

}
