package ru.codeunited.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * @author Natalia Andrianova on 23.08.2016.
 */
@Repository
public class MessageIncQueueDao extends AbstractDao{

    public static final String TABLE_NAME = "msg_inc";
    public static final String INSERT = "INSERT INTO " + TABLE_NAME + " (msg_id, body, queue_name) VALUES (?,?,?)";
    public static final String SELECT_ALL = "SELECT * FROM " + TABLE_NAME;
    public static final String SELECT_BY_ID = "SELECT * FROM " + TABLE_NAME + " WHERE msg_id = ?";

    public MessageIncQueueDao() {
    }

//    @Autowired
//    public MessageIncQueueDao(DataSource dataSource) {
//        super(dataSource);
//    }

    @Override
    protected String getInsertStatement() {
        return INSERT;
    }

    @Override
    protected String getSelectAllStatement() {
        return SELECT_ALL;
    }
}