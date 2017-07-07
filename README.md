# hangout-filters-arraymap


hangout对数组元素的Map操作, 将数组遍历拆成多条数据。

配置样例
```
inputs:
    - Stdin:
        codec: json
filters:
    - com.bip.hangout.filters.ArrayMap:
        fields: ["logs"]
          
outputs:
    - Stdout: {}
```

效果如下
```
{"group":"logs", "logs":[{"tags":"hello"},{"tags":"world"}]}
{"logs":[{"tags":"hello"},{"tags":"world"}],"group":"logs"}
{logs=[{"tags":"hello"},{"tags":"world"}], group=logs, tags=hello}
{logs=[{"tags":"hello"},{"tags":"world"}], group=logs, tags=world}
```

enhancement

**ArrayMap**会保留原始日志， 如果不需要原始数据需要主动丢弃。
