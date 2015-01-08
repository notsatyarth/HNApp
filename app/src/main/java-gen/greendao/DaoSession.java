package greendao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import greendao.HNItem;

import greendao.HNItemDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig hNItemDaoConfig;

    private final HNItemDao hNItemDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        hNItemDaoConfig = daoConfigMap.get(HNItemDao.class).clone();
        hNItemDaoConfig.initIdentityScope(type);

        hNItemDao = new HNItemDao(hNItemDaoConfig, this);

        registerDao(HNItem.class, hNItemDao);
    }
    
    public void clear() {
        hNItemDaoConfig.getIdentityScope().clear();
    }

    public HNItemDao getHNItemDao() {
        return hNItemDao;
    }

}
