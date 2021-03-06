package com.example.hzxr.thetesgt.mvp.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.hzxr.thetesgt.mvp.bean.User;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER".
*/
public class UserDao extends AbstractDao<User, String> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property UserName = new Property(0, String.class, "userName", true, "USER_NAME");
        public final static Property PassWord = new Property(1, String.class, "passWord", false, "PASS_WORD");
    }


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER\" (" + //
                "\"USER_NAME\" TEXT PRIMARY KEY NOT NULL ," + // 0: userName
                "\"PASS_WORD\" TEXT);"); // 1: passWord
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, User entity) {
        stmt.clearBindings();
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(1, userName);
        }
 
        String passWord = entity.getPassWord();
        if (passWord != null) {
            stmt.bindString(2, passWord);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(1, userName);
        }
 
        String passWord = entity.getPassWord();
        if (passWord != null) {
            stmt.bindString(2, passWord);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // userName
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1) // passWord
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setUserName(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setPassWord(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
     }
    
    @Override
    protected final String updateKeyAfterInsert(User entity, long rowId) {
        return entity.getUserName();
    }
    
    @Override
    public String getKey(User entity) {
        if(entity != null) {
            return entity.getUserName();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(User entity) {
        return entity.getUserName() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
