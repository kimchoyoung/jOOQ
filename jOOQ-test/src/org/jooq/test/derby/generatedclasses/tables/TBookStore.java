/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookStore extends org.jooq.impl.TableImpl<org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = 1576445321;

	/**
	 * The singleton instance of <code>TEST.T_BOOK_STORE</code>
	 */
	public static final org.jooq.test.derby.generatedclasses.tables.TBookStore T_BOOK_STORE = new org.jooq.test.derby.generatedclasses.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord> getRecordType() {
		return org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord.class;
	}

	/**
	 * The column <code>TEST.T_BOOK_STORE.NAME</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), T_BOOK_STORE, "");

	/**
	 * No further instances allowed
	 */
	private TBookStore() {
		this("T_BOOK_STORE", null);
	}

	private TBookStore(java.lang.String alias, org.jooq.Table<org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBookStore(java.lang.String alias, org.jooq.Table<org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.derby.generatedclasses.Test.TEST, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord> getPrimaryKey() {
		return org.jooq.test.derby.generatedclasses.Keys.UK_T_BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord>>asList(org.jooq.test.derby.generatedclasses.Keys.UK_T_BOOK_STORE_NAME);
	}
}
