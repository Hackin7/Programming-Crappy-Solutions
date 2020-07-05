.class public final Ljy;
.super Ljava/lang/Object;


# static fields
.field private static final c:Ljava/util/regex/Pattern;

.field private static final d:Ljava/util/regex/Pattern;

.field private static final e:Ljava/util/regex/Pattern;

.field private static final f:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field private final g:J

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Z

.field private final k:Z

.field private final l:Z

.field private final m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "(\\d{2,4})[^\\d]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ljy;->c:Ljava/util/regex/Pattern;

    const-string v0, "(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ljy;->d:Ljava/util/regex/Pattern;

    const-string v0, "(\\d{1,2})[^\\d]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ljy;->e:Ljava/util/regex/Pattern;

    const-string v0, "(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ljy;->f:Ljava/util/regex/Pattern;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljy;->a:Ljava/lang/String;

    iput-object p2, p0, Ljy;->b:Ljava/lang/String;

    iput-wide p3, p0, Ljy;->g:J

    iput-object p5, p0, Ljy;->h:Ljava/lang/String;

    iput-object p6, p0, Ljy;->i:Ljava/lang/String;

    iput-boolean p7, p0, Ljy;->j:Z

    iput-boolean p8, p0, Ljy;->k:Z

    iput-boolean p9, p0, Ljy;->m:Z

    iput-boolean p10, p0, Ljy;->l:Z

    return-void
.end method

.method private static a(Ljava/lang/String;IIZ)I
    .locals 3

    :goto_0
    if-ge p1, p2, :cond_7

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_5

    :cond_0
    const/16 v1, 0x7f

    if-ge v0, v1, :cond_5

    const/16 v1, 0x30

    if-lt v0, v1, :cond_1

    const/16 v1, 0x39

    if-le v0, v1, :cond_5

    :cond_1
    const/16 v1, 0x61

    if-lt v0, v1, :cond_2

    const/16 v1, 0x7a

    if-le v0, v1, :cond_5

    :cond_2
    const/16 v1, 0x41

    if-lt v0, v1, :cond_3

    const/16 v1, 0x5a

    if-le v0, v1, :cond_5

    :cond_3
    const/16 v1, 0x3a

    if-ne v0, v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    move v0, v2

    :goto_2
    xor-int/lit8 v1, p3, 0x1

    if-ne v0, v1, :cond_6

    return p1

    :cond_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_7
    return p2
.end method

.method private static a(Ljava/lang/String;)J
    .locals 6

    const-wide/high16 v0, -0x8000000000000000L

    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-gtz p0, :cond_0

    return-wide v0

    :cond_0
    return-wide v2

    :catch_0
    move-exception v2

    const-string v3, "-?\\d+"

    invoke-virtual {p0, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v2, "-"

    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    return-wide v0

    :cond_1
    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    :cond_2
    throw v2
.end method

.method public static a(Lkf;Lke;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkf;",
            "Lke;",
            ")",
            "Ljava/util/List<",
            "Ljy;",
            ">;"
        }
    .end annotation

    const-string v0, "Set-Cookie"

    iget-object v1, p1, Lke;->a:[Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    array-length v1, v1

    div-int/2addr v1, v2

    move v5, v3

    move-object v6, v4

    :goto_0
    if-ge v5, v1, :cond_2

    invoke-virtual {p1, v5}, Lke;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    if-nez v6, :cond_0

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    :cond_0
    invoke-virtual {p1, v5}, Lke;->b(I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    if-eqz v6, :cond_3

    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    :goto_2
    if-ge v3, v0, :cond_6

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6, p0, v1}, Ljy;->a(JLkf;Ljava/lang/String;)Ljy;

    move-result-object v1

    if-eqz v1, :cond_5

    if-nez v4, :cond_4

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :cond_4
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    if-eqz v4, :cond_7

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_7
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static a(JLkf;Ljava/lang/String;)Ljy;
    .locals 31
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    move-object/from16 v2, p3

    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x3b

    const/4 v5, 0x0

    invoke-static {v2, v5, v3, v4}, Lkv;->a(Ljava/lang/String;IIC)I

    move-result v6

    const/16 v7, 0x3d

    invoke-static {v2, v5, v6, v7}, Lkv;->a(Ljava/lang/String;IIC)I

    move-result v8

    const/4 v9, 0x0

    if-ne v8, v6, :cond_0

    return-object v9

    :cond_0
    invoke-static {v2, v5, v8}, Lkv;->c(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_2f

    invoke-static {v11}, Lkv;->b(Ljava/lang/String;)I

    move-result v10

    const/4 v12, -0x1

    if-eq v10, v12, :cond_1

    goto/16 :goto_15

    :cond_1
    const/4 v10, 0x1

    add-int/2addr v8, v10

    invoke-static {v2, v8, v6}, Lkv;->c(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lkv;->b(Ljava/lang/String;)I

    move-result v13

    if-eq v13, v12, :cond_2

    return-object v9

    :cond_2
    add-int/2addr v6, v10

    move/from16 v22, v5

    move/from16 v23, v22

    move/from16 v25, v23

    move-object/from16 v21, v9

    move/from16 v24, v10

    const-wide/16 v17, -0x1

    const-wide v19, 0xe677d21fdbffL

    :goto_0
    if-ge v6, v3, :cond_21

    invoke-static {v2, v6, v3, v4}, Lkv;->a(Ljava/lang/String;IIC)I

    move-result v15

    invoke-static {v2, v6, v15, v7}, Lkv;->a(Ljava/lang/String;IIC)I

    move-result v13

    invoke-static {v2, v6, v13}, Lkv;->c(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v6

    if-ge v13, v15, :cond_3

    add-int/lit8 v13, v13, 0x1

    invoke-static {v2, v13, v15}, Lkv;->c(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v13

    goto :goto_1

    :cond_3
    const-string v13, ""

    :goto_1
    const-string v14, "expires"

    invoke-virtual {v6, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_18

    :try_start_0
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v6

    invoke-static {v13, v5, v6, v5}, Ljy;->a(Ljava/lang/String;IIZ)I

    move-result v14

    sget-object v7, Ljy;->f:Ljava/util/regex/Pattern;

    invoke-virtual {v7, v13}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    move v4, v12

    move v5, v4

    move/from16 v26, v5

    move/from16 v27, v26

    move/from16 v28, v27

    move/from16 v29, v28

    :goto_2
    if-ge v14, v6, :cond_b

    add-int/lit8 v12, v14, 0x1

    :try_start_1
    invoke-static {v13, v12, v6, v10}, Ljy;->a(Ljava/lang/String;IIZ)I

    move-result v12

    invoke-virtual {v7, v14, v12}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    const/4 v14, -0x1

    if-ne v5, v14, :cond_5

    sget-object v14, Ljy;->f:Ljava/util/regex/Pattern;

    invoke-virtual {v7, v14}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v14

    invoke-virtual {v14}, Ljava/util/regex/Matcher;->matches()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-virtual {v7, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    const/4 v14, 0x2

    invoke-virtual {v7, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v14

    const/4 v10, 0x3

    invoke-virtual {v7, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    move/from16 v29, v10

    move/from16 v28, v14

    goto/16 :goto_6

    :cond_4
    move/from16 v10, v27

    const/4 v14, -0x1

    goto :goto_3

    :cond_5
    move/from16 v10, v27

    :goto_3
    if-ne v10, v14, :cond_7

    sget-object v14, Ljy;->e:Ljava/util/regex/Pattern;

    invoke-virtual {v7, v14}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v14

    invoke-virtual {v14}, Ljava/util/regex/Matcher;->matches()Z

    move-result v14

    if-eqz v14, :cond_6

    const/4 v14, 0x1

    invoke-virtual {v7, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    :goto_4
    move/from16 v27, v10

    goto :goto_6

    :cond_6
    move/from16 v14, v26

    const/4 v2, -0x1

    goto :goto_5

    :cond_7
    move v2, v14

    move/from16 v14, v26

    :goto_5
    if-ne v14, v2, :cond_9

    sget-object v2, Ljy;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v7, v2}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, 0x1

    invoke-virtual {v7, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v14

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v14, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    sget-object v14, Ljy;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v14}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    div-int/lit8 v2, v2, 0x4

    move/from16 v26, v2

    goto :goto_4

    :cond_8
    const/4 v2, -0x1

    :cond_9
    if-ne v4, v2, :cond_a

    sget-object v2, Ljy;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v7, v2}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, 0x1

    invoke-virtual {v7, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    move v4, v2

    :cond_a
    move/from16 v27, v10

    move/from16 v26, v14

    :goto_6
    add-int/lit8 v12, v12, 0x1

    const/4 v2, 0x0

    invoke-static {v13, v12, v6, v2}, Ljy;->a(Ljava/lang/String;IIZ)I

    move-result v14

    move-object/from16 v2, p3

    const/4 v10, 0x1

    goto/16 :goto_2

    :catch_0
    const/16 v7, 0x3b

    goto/16 :goto_c

    :cond_b
    move/from16 v14, v26

    move/from16 v10, v27

    const/16 v2, 0x46

    if-lt v4, v2, :cond_c

    const/16 v2, 0x63

    if-gt v4, v2, :cond_c

    add-int/lit16 v4, v4, 0x76c

    :cond_c
    if-ltz v4, :cond_d

    const/16 v2, 0x45

    if-gt v4, v2, :cond_d

    add-int/lit16 v4, v4, 0x7d0

    :cond_d
    const/16 v2, 0x641

    if-ge v4, v2, :cond_e

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v2

    :cond_e
    const/4 v2, -0x1

    if-ne v14, v2, :cond_f

    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-direct {v4}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v4
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_f
    if-lez v10, :cond_17

    const/16 v6, 0x1f

    if-le v10, v6, :cond_10

    goto :goto_a

    :cond_10
    if-ltz v5, :cond_16

    const/16 v6, 0x17

    if-le v5, v6, :cond_11

    goto :goto_9

    :cond_11
    move/from16 v12, v28

    if-ltz v12, :cond_15

    const/16 v7, 0x3b

    if-le v12, v7, :cond_12

    goto :goto_8

    :cond_12
    move/from16 v6, v29

    if-ltz v6, :cond_14

    if-le v6, v7, :cond_13

    goto :goto_7

    :cond_13
    :try_start_2
    new-instance v13, Ljava/util/GregorianCalendar;

    sget-object v2, Lkv;->g:Ljava/util/TimeZone;

    invoke-direct {v13, v2}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    const/4 v2, 0x0

    invoke-virtual {v13, v2}, Ljava/util/Calendar;->setLenient(Z)V

    const/4 v2, 0x1

    invoke-virtual {v13, v2, v4}, Ljava/util/Calendar;->set(II)V

    add-int/lit8 v2, v14, -0x1

    const/4 v4, 0x2

    invoke-virtual {v13, v4, v2}, Ljava/util/Calendar;->set(II)V

    const/4 v2, 0x5

    invoke-virtual {v13, v2, v10}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xb

    invoke-virtual {v13, v2, v5}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xc

    invoke-virtual {v13, v2, v12}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xd

    invoke-virtual {v13, v2, v6}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xe

    const/4 v4, 0x0

    invoke-virtual {v13, v2, v4}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v13}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    move-wide/from16 v19, v4

    goto :goto_b

    :cond_14
    :goto_7
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v2

    :cond_15
    const/16 v7, 0x3b

    :goto_8
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v2

    :cond_16
    :goto_9
    const/16 v7, 0x3b

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v2

    :cond_17
    :goto_a
    const/16 v7, 0x3b

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_1
    move v7, v4

    goto :goto_c

    :cond_18
    move v7, v4

    const-string v2, "max-age"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_19

    :try_start_3
    invoke-static {v13}, Ljy;->a(Ljava/lang/String;)J

    move-result-wide v4
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    move-wide/from16 v17, v4

    :goto_b
    const/16 v25, 0x1

    goto :goto_c

    :cond_19
    const-string v2, "domain"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1d

    :try_start_4
    const-string v2, "."

    invoke-virtual {v13, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1a

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v2

    :cond_1a
    const-string v2, "."

    invoke-virtual {v13, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1b

    const/4 v2, 0x1

    invoke-virtual {v13, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v13

    :cond_1b
    invoke-static {v13}, Lkv;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1c

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v2
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_2

    :cond_1c
    move-object v9, v2

    const/16 v24, 0x0

    goto :goto_c

    :cond_1d
    const-string v2, "path"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1e

    move-object/from16 v21, v13

    goto :goto_c

    :cond_1e
    const-string v2, "secure"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1f

    const/16 v22, 0x1

    goto :goto_c

    :cond_1f
    const-string v2, "httponly"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_20

    const/16 v23, 0x1

    :catch_2
    :cond_20
    :goto_c
    add-int/lit8 v6, v15, 0x1

    move v4, v7

    move-object/from16 v2, p3

    const/4 v5, 0x0

    const/16 v7, 0x3d

    const/4 v10, 0x1

    const/4 v12, -0x1

    goto/16 :goto_0

    :cond_21
    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v17, v2

    if-nez v4, :cond_23

    :cond_22
    move-object/from16 v0, p2

    move-wide v13, v2

    goto :goto_f

    :cond_23
    const-wide/16 v2, -0x1

    cmp-long v2, v17, v2

    if-eqz v2, :cond_26

    const-wide v2, 0x20c49ba5e353f7L

    cmp-long v2, v17, v2

    if-gtz v2, :cond_24

    const-wide/16 v2, 0x3e8

    mul-long v17, v17, v2

    goto :goto_d

    :cond_24
    const-wide v17, 0x7fffffffffffffffL

    :goto_d
    add-long v2, p0, v17

    cmp-long v0, v2, p0

    if-ltz v0, :cond_25

    const-wide v0, 0xe677d21fdbffL

    cmp-long v4, v2, v0

    if-lez v4, :cond_22

    goto :goto_e

    :cond_25
    const-wide v0, 0xe677d21fdbffL

    :goto_e
    move-wide v13, v0

    move-object/from16 v0, p2

    goto :goto_f

    :cond_26
    move-object/from16 v0, p2

    move-wide/from16 v13, v19

    :goto_f
    iget-object v1, v0, Lkf;->b:Ljava/lang/String;

    if-nez v9, :cond_27

    move-object v15, v1

    const/4 v2, 0x0

    goto :goto_11

    :cond_27
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_28

    const/4 v3, 0x1

    goto :goto_10

    :cond_28
    invoke-virtual {v1, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_29

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v2, v3

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x2e

    if-ne v2, v4, :cond_29

    invoke-static {v1}, Lkv;->c(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_29

    goto :goto_10

    :cond_29
    const/4 v3, 0x0

    :goto_10
    if-nez v3, :cond_2a

    const/4 v2, 0x0

    return-object v2

    :cond_2a
    const/4 v2, 0x0

    move-object v15, v9

    :goto_11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v1, v3, :cond_2b

    invoke-static {}, Lmq;->a()Lmq;

    move-result-object v1

    invoke-virtual {v1, v15}, Lmq;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2b

    return-object v2

    :cond_2b
    move-object/from16 v9, v21

    if-eqz v9, :cond_2d

    const-string v1, "/"

    invoke-virtual {v9, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2c

    goto :goto_12

    :cond_2c
    move-object/from16 v16, v9

    goto :goto_14

    :cond_2d
    :goto_12
    invoke-virtual/range {p2 .. p2}, Lkf;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    if-eqz v1, :cond_2e

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_13

    :cond_2e
    const-string v0, "/"

    :goto_13
    move-object/from16 v16, v0

    :goto_14
    new-instance v0, Ljy;

    move-object v10, v0

    move-object v12, v8

    move/from16 v17, v22

    move/from16 v18, v23

    move/from16 v19, v24

    move/from16 v20, v25

    invoke-direct/range {v10 .. v20}, Ljy;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V

    return-object v0

    :cond_2f
    :goto_15
    move-object v0, v9

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    instance-of v0, p1, Ljy;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ljy;

    iget-object v0, p1, Ljy;->a:Ljava/lang/String;

    iget-object v2, p0, Ljy;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Ljy;->b:Ljava/lang/String;

    iget-object v2, p0, Ljy;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Ljy;->h:Ljava/lang/String;

    iget-object v2, p0, Ljy;->h:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Ljy;->i:Ljava/lang/String;

    iget-object v2, p0, Ljy;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v2, p1, Ljy;->g:J

    iget-wide v4, p0, Ljy;->g:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-boolean v0, p1, Ljy;->j:Z

    iget-boolean v2, p0, Ljy;->j:Z

    if-ne v0, v2, :cond_1

    iget-boolean v0, p1, Ljy;->k:Z

    iget-boolean v2, p0, Ljy;->k:Z

    if-ne v0, v2, :cond_1

    iget-boolean v0, p1, Ljy;->l:Z

    iget-boolean v2, p0, Ljy;->l:Z

    if-ne v0, v2, :cond_1

    iget-boolean p1, p1, Ljy;->m:Z

    iget-boolean v0, p0, Ljy;->m:Z

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 7

    iget-object v0, p0, Ljy;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    const/16 v0, 0x1f

    mul-int/2addr v1, v0

    iget-object v2, p0, Ljy;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/2addr v1, v0

    iget-object v2, p0, Ljy;->h:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/2addr v1, v0

    iget-object v2, p0, Ljy;->i:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/2addr v1, v0

    iget-wide v2, p0, Ljy;->g:J

    iget-wide v4, p0, Ljy;->g:J

    const/16 v6, 0x20

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/2addr v1, v0

    iget-boolean v2, p0, Ljy;->j:Z

    xor-int/lit8 v2, v2, 0x1

    add-int/2addr v1, v2

    mul-int/2addr v1, v0

    iget-boolean v2, p0, Ljy;->k:Z

    xor-int/lit8 v2, v2, 0x1

    add-int/2addr v1, v2

    mul-int/2addr v1, v0

    iget-boolean v2, p0, Ljy;->l:Z

    xor-int/lit8 v2, v2, 0x1

    add-int/2addr v1, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Ljy;->m:Z

    xor-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ljy;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljy;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ljy;->l:Z

    if-eqz v1, :cond_1

    iget-wide v1, p0, Ljy;->g:J

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    const-string v1, "; max-age=0"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const-string v1, "; expires="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/util/Date;

    iget-wide v2, p0, Ljy;->g:J

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {v1}, Lll;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    :goto_1
    iget-boolean v1, p0, Ljy;->m:Z

    if-nez v1, :cond_2

    const-string v1, "; domain="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljy;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const-string v1, "; path="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljy;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ljy;->j:Z

    if-eqz v1, :cond_3

    const-string v1, "; secure"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-boolean v1, p0, Ljy;->k:Z

    if-eqz v1, :cond_4

    const-string v1, "; httponly"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
