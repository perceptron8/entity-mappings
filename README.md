# element-collection

The following is illegal according to `http://xmlns.jcp.org/xml/ns/persistence/orm_2_2.xsd`.

```
<element-collection name="...">
	<column name="..." />
	<convert converter="..."/>
</element-collection>
```

Why is that?
