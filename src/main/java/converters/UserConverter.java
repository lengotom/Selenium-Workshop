package converters;

import java.util.Map;

import org.easetech.easytest.converter.AbstractConverter;

import vo.User;

public class UserConverter extends AbstractConverter<User> {
	 private static final String USERNAME = "userName";
	 private static final String PASSWORD = "password";
	 private static final String FIRST_NAME = "firstName";
	 private static final String LAST_NAME = "lastName";
	 private static final String PHONE_NUMBER = "phone";
	 private static final String EMAIL = "email";
	 private static final String ADDRESS_1 = "address1";
	 private static final String ADDRESS_2 = "address2";
	 private static final String CITY = "city";
	 private static final String STATE = "state";
	 private static final String POSTAL_CODE = "postalCode";
	 private static final String COUNTRY = "country";
	 public User convert(Map<String, Object> convertFrom) {
	  if (convertFrom == null) {
	   throw new IllegalArgumentException("Can't convert from not existing map");
	  }
	  User user = new User();
	  user.setUserName((String) convertFrom.get(USERNAME));
	  user.setPassword((String) convertFrom.get(PASSWORD));
	  user.setFirstName((String) convertFrom.get(FIRST_NAME));
	  user.setLastName((String) convertFrom.get(LAST_NAME));
	  user.setPhone((String) convertFrom.get(PHONE_NUMBER));
	  user.setEmail((String) convertFrom.get(EMAIL));
	  user.setAddress1((String) convertFrom.get(ADDRESS_1));
	  user.setAddress2((String) convertFrom.get(ADDRESS_2));
	  user.setCity((String) convertFrom.get(CITY));
	  user.setState((String) convertFrom.get(STATE));
	  user.setPostalCode((String) convertFrom.get(POSTAL_CODE));
	  user.setCountry((String) convertFrom.get(COUNTRY));
	  return user;
	 }
	}
