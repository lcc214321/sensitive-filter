# sensitive-filter
敏感词过滤器

这是一个敏感词的过滤器。
采用的是类似hash桶的方式分散敏感词，提高hash命中。
有两种加载资源的方式，可结合自身业务选择。
入口：SensitiveFilter.DEFAULT.filter(str);


***备注***
1.sensi_words.txt中敏感词格式为一行一个。
2.敏感词的数量理论没有上限。
3.最好用静态加载，第一次调用的时候加载一次。
4.过滤速度非常快，满足中小应用。
