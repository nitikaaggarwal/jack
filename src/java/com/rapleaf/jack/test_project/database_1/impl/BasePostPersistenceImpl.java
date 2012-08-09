
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Timestamp;

import com.rapleaf.jack.AbstractDatabaseModel;
import com.rapleaf.jack.BaseDatabaseConnection;
import com.rapleaf.jack.ModelWithId;

import com.rapleaf.jack.test_project.database_1.models.Post;
import com.rapleaf.jack.test_project.database_1.iface.IPostPersistence;

import com.rapleaf.jack.test_project.IDatabases;

public class BasePostPersistenceImpl extends AbstractDatabaseModel<Post> implements IPostPersistence {
  private final IDatabases databases;

  public BasePostPersistenceImpl(BaseDatabaseConnection conn, IDatabases databases) {
    super(conn, "posts", Arrays.asList("title", "posted_at_millis", "user_id"));
    this.databases = databases;
  }

  @Override
  public ModelWithId create(Map<Enum, Object> fieldsMap) throws IOException {
    String title = (String) fieldsMap.get(Post._Fields.title);
    Long posted_at_millis = (Long) fieldsMap.get(Post._Fields.posted_at_millis);
    Integer user_id = (Integer) fieldsMap.get(Post._Fields.user_id);
    return create(title, posted_at_millis, user_id);
  }


  public Post create(final String title, final Long posted_at_millis, final Integer user_id) throws IOException {
    long __id = realCreate(new AttrSetter() {
      public void set(PreparedStatement stmt) throws SQLException {
        if (title == null) {
          stmt.setNull(1, java.sql.Types.CHAR);
        } else {
          stmt.setString(1, title);
        }
        if (posted_at_millis == null) {
          stmt.setNull(2, java.sql.Types.DATE);
        } else {
          stmt.setDate(2, new Date(posted_at_millis));
        }
        if (user_id == null) {
          stmt.setNull(3, java.sql.Types.INTEGER);
        } else {
          stmt.setInt(3, user_id);
        }
      }
    }, getInsertStatement(Arrays.asList("title", "posted_at_millis", "user_id")));
    Post newInst = new Post(__id, title, posted_at_millis, user_id, databases);
    cachedById.put(__id, newInst);
    clearForeignKeyCache();
    return newInst;
  }


  public Set<Post> find(Map<Enum, Object> fieldsMap) throws IOException {
    return find(null, fieldsMap);
  }

  public Set<Post> find(Set<Long> ids, Map<Enum, Object> fieldsMap) throws IOException {
    Set<Post> foundSet = new HashSet<Post>();
    
    if (fieldsMap == null || fieldsMap.isEmpty()) {
      return foundSet;
    }

    StringBuilder statementString = new StringBuilder();
    statementString.append("SELECT * FROM posts WHERE (");
    List<Object> nonNullValues = new ArrayList<Object>();
    List<Post._Fields> nonNullValueFields = new ArrayList<Post._Fields>();

    Iterator<Map.Entry<Enum, Object>> iter = fieldsMap.entrySet().iterator();
    while (iter.hasNext()) {
      Map.Entry<Enum, Object> entry = iter.next();
      Enum field = entry.getKey();
      Object value = entry.getValue();
      
      String queryValue = value != null ? " = ? " : " IS NULL";
      if (value != null) {
        nonNullValueFields.add((Post._Fields) field);
        nonNullValues.add(value);
      }

      statementString.append(field + queryValue);
      if (iter.hasNext()) {
        statementString.append(" AND ");
      }
    }
    if (ids != null) statementString.append(" AND " + getIdSetCondition(ids));
    statementString.append(")");

    PreparedStatement preparedStatement = getPreparedStatement(statementString.toString());

    for (int i = 0; i < nonNullValues.size(); i++) {
      Post._Fields field = nonNullValueFields.get(i);
      try {
        switch (field) {
          case title:
            preparedStatement.setString(i+1, (String) nonNullValues.get(i));
            break;
          case posted_at_millis:
            preparedStatement.setDate(i+1, new Date((Long) nonNullValues.get(i)));
            break;
          case user_id:
            preparedStatement.setInt(i+1, (Integer) nonNullValues.get(i));
            break;
        }
      } catch (SQLException e) {
        throw new IOException(e);
      }
    }
    executeQuery(foundSet, preparedStatement);

    return foundSet;
  }

  @Override
  protected void setAttrs(Post model, PreparedStatement stmt) throws SQLException {
    if (model.getTitle() == null) {
      stmt.setNull(1, java.sql.Types.CHAR);
    } else {
      stmt.setString(1, model.getTitle());
    }
    if (model.getPostedAtMillis() == null) {
      stmt.setNull(2, java.sql.Types.DATE);
    } else {
      stmt.setDate(2, new Date(model.getPostedAtMillis()));
    }
    if (model.getUserId() == null) {
      stmt.setNull(3, java.sql.Types.INTEGER);
    } else {
      stmt.setInt(3, model.getUserId());
    }
    stmt.setLong(4, model.getId());
  }

  @Override
  protected Post instanceFromResultSet(ResultSet rs) throws SQLException {
    return new Post(rs.getLong("id"),
      rs.getString("title"),
      getDateAsLong(rs, "posted_at_millis"),
      getIntOrNull(rs, "user_id"),
      databases
    );
  }

  public Set<Post> findByTitle(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Post._Fields.title, value);}});
  }

  public Set<Post> findByPostedAtMillis(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Post._Fields.posted_at_millis, value);}});
  }

  public Set<Post> findByUserId(final Integer value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Post._Fields.user_id, value);}});
  }
}
