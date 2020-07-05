.class public final Lkf$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkf$a$a;
    }
.end annotation


# instance fields
.field a:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field e:I

.field final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field h:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lkf$a;->b:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lkf$a;->c:Ljava/lang/String;

    const/4 v0, -0x1

    iput v0, p0, Lkf$a;->e:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkf$a;->f:Ljava/util/List;

    iget-object v0, p0, Lkf$a;->f:Ljava/util/List;

    const-string v1, ""

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method static a(Ljava/lang/String;II)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lkf;->a(Ljava/lang/String;IIZ)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkv;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private b(Ljava/lang/String;II)V
    .locals 11

    if-ne p2, p3, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2f

    const/4 v2, 0x1

    if-eq v0, v1, :cond_2

    const/16 v1, 0x5c

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkf$a;->f:Ljava/util/List;

    iget-object v1, p0, Lkf$a;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v2

    const-string v3, ""

    invoke-interface {v0, v1, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    :goto_0
    iget-object v0, p0, Lkf$a;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lkf$a;->f:Ljava/util/List;

    const-string v1, ""

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 p2, p2, 0x1

    :cond_3
    :goto_2
    move v4, p2

    if-ge v4, p3, :cond_d

    const-string p2, "/\\"

    invoke-static {p1, v4, p3, p2}, Lkv;->a(Ljava/lang/String;IILjava/lang/String;)I

    move-result p2

    const/4 v0, 0x0

    if-ge p2, p3, :cond_4

    move v1, v2

    goto :goto_3

    :cond_4
    move v1, v0

    :goto_3
    const-string v6, " \"<>^`{}|/\\?#"

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v3, p1

    move v5, p2

    invoke-static/range {v3 .. v10}, Lkf;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v3

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    const-string v4, "%2e"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_4

    :cond_5
    move v4, v0

    goto :goto_5

    :cond_6
    :goto_4
    move v4, v2

    :goto_5
    if-nez v4, :cond_c

    const-string v4, ".."

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    const-string v4, "%2e."

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_7

    const-string v4, ".%2e"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_7

    const-string v4, "%2e%2e"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    :cond_7
    move v0, v2

    :cond_8
    if-eqz v0, :cond_a

    iget-object v0, p0, Lkf$a;->f:Ljava/util/List;

    iget-object v3, p0, Lkf$a;->f:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-interface {v0, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lkf$a;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lkf$a;->f:Ljava/util/List;

    iget-object v3, p0, Lkf$a;->f:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v2

    const-string v4, ""

    invoke-interface {v0, v3, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_9
    :goto_6
    iget-object v0, p0, Lkf$a;->f:Ljava/util/List;

    const-string v3, ""

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_a
    iget-object v0, p0, Lkf$a;->f:Ljava/util/List;

    iget-object v4, p0, Lkf$a;->f:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lkf$a;->f:Ljava/util/List;

    iget-object v4, p0, Lkf$a;->f:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-interface {v0, v4, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_b
    iget-object v0, p0, Lkf$a;->f:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_7
    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    :goto_8
    if-eqz v1, :cond_3

    goto/16 :goto_1

    :cond_d
    return-void
.end method

.method private static c(Ljava/lang/String;II)I
    .locals 2

    :goto_0
    if-ge p1, p2, :cond_3

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x3a

    if-eq v0, v1, :cond_2

    const/16 v1, 0x5b

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    if-ge p1, p2, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x5d

    if-ne v0, v1, :cond_0

    :cond_1
    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return p1

    :cond_3
    return p2
.end method

.method private static d(Ljava/lang/String;II)I
    .locals 9

    const/4 v0, -0x1

    :try_start_0
    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v1, p0

    move v2, p1

    move v3, p2

    invoke-static/range {v1 .. v8}, Lkf;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-lez p0, :cond_0

    const p1, 0xffff

    if-gt p0, p1, :cond_0

    return p0

    :catch_0
    :cond_0
    return v0
.end method


# virtual methods
.method final a()I
    .locals 2

    iget v0, p0, Lkf$a;->e:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Lkf$a;->e:I

    return v0

    :cond_0
    iget-object v0, p0, Lkf$a;->a:Ljava/lang/String;

    invoke-static {v0}, Lkf;->a(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method final a(Lkf;Ljava/lang/String;)I
    .locals 22
    .param p1    # Lkf;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v9, p2

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v8, 0x0

    invoke-static {v9, v8, v2}, Lkv;->a(Ljava/lang/String;II)I

    move-result v10

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v9, v10, v2}, Lkv;->b(Ljava/lang/String;II)I

    move-result v11

    sub-int v2, v11, v10

    const/16 v12, 0x3a

    const/4 v13, 0x2

    const/4 v14, -0x1

    if-lt v2, v13, :cond_6

    invoke-virtual {v9, v10}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5a

    const/16 v4, 0x41

    const/16 v5, 0x7a

    const/16 v6, 0x61

    if-lt v2, v6, :cond_0

    if-le v2, v5, :cond_1

    :cond_0
    if-lt v2, v4, :cond_6

    if-le v2, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v10, 0x1

    :goto_0
    if-ge v2, v11, :cond_6

    invoke-virtual {v9, v2}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v6, :cond_2

    if-le v7, v5, :cond_5

    :cond_2
    if-lt v7, v4, :cond_3

    if-le v7, v3, :cond_5

    :cond_3
    const/16 v15, 0x30

    if-lt v7, v15, :cond_4

    const/16 v15, 0x39

    if-le v7, v15, :cond_5

    :cond_4
    const/16 v15, 0x2b

    if-eq v7, v15, :cond_5

    const/16 v15, 0x2d

    if-eq v7, v15, :cond_5

    const/16 v15, 0x2e

    if-eq v7, v15, :cond_5

    if-ne v7, v12, :cond_6

    goto :goto_2

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    move v2, v14

    :goto_2
    if-eq v2, v14, :cond_9

    const/4 v3, 0x1

    const-string v5, "https:"

    const/4 v6, 0x0

    const/4 v7, 0x6

    move-object v2, v9

    move v4, v10

    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v2

    if-eqz v2, :cond_7

    const-string v2, "https"

    iput-object v2, v0, Lkf$a;->a:Ljava/lang/String;

    add-int/lit8 v10, v10, 0x6

    goto :goto_3

    :cond_7
    const/4 v3, 0x1

    const-string v5, "http:"

    const/4 v6, 0x0

    const/4 v7, 0x5

    move-object v2, v9

    move v4, v10

    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v2

    if-eqz v2, :cond_8

    const-string v2, "http"

    iput-object v2, v0, Lkf$a;->a:Ljava/lang/String;

    add-int/lit8 v10, v10, 0x5

    goto :goto_3

    :cond_8
    sget v1, Lkf$a$a;->c:I

    return v1

    :cond_9
    if-eqz v1, :cond_1a

    iget-object v2, v1, Lkf;->a:Ljava/lang/String;

    iput-object v2, v0, Lkf$a;->a:Ljava/lang/String;

    :goto_3
    move v3, v8

    move v2, v10

    :goto_4
    const/16 v15, 0x2f

    const/16 v7, 0x5c

    if-ge v2, v11, :cond_b

    invoke-virtual {v9, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v4, v7, :cond_a

    if-ne v4, v15, :cond_b

    :cond_a
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_b
    const/16 v6, 0x23

    const/16 v16, 0x1

    if-ge v3, v13, :cond_f

    if-eqz v1, :cond_f

    iget-object v2, v1, Lkf;->a:Ljava/lang/String;

    iget-object v4, v0, Lkf$a;->a:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_5

    :cond_c
    invoke-virtual/range {p1 .. p1}, Lkf;->c()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lkf$a;->b:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lkf;->d()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lkf$a;->c:Ljava/lang/String;

    iget-object v2, v1, Lkf;->b:Ljava/lang/String;

    iput-object v2, v0, Lkf$a;->d:Ljava/lang/String;

    iget v2, v1, Lkf;->c:I

    iput v2, v0, Lkf$a;->e:I

    iget-object v2, v0, Lkf$a;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    iget-object v2, v0, Lkf$a;->f:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lkf;->f()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    if-eq v10, v11, :cond_d

    invoke-virtual {v9, v10}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v6, :cond_e

    :cond_d
    invoke-virtual/range {p1 .. p1}, Lkf;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkf$a;->a(Ljava/lang/String;)Lkf$a;

    :cond_e
    move v15, v10

    goto/16 :goto_9

    :cond_f
    :goto_5
    add-int/2addr v10, v3

    move v13, v8

    move v2, v10

    move v10, v13

    :goto_6
    const-string v1, "@/\\?#"

    invoke-static {v9, v2, v11, v1}, Lkv;->a(Ljava/lang/String;IILjava/lang/String;)I

    move-result v8

    if-eq v8, v11, :cond_10

    invoke-virtual {v9, v8}, Ljava/lang/String;->charAt(I)C

    move-result v1

    goto :goto_7

    :cond_10
    move v1, v14

    :goto_7
    if-eq v1, v14, :cond_14

    if-eq v1, v6, :cond_14

    if-eq v1, v15, :cond_14

    if-eq v1, v7, :cond_14

    packed-switch v1, :pswitch_data_0

    goto :goto_6

    :pswitch_0
    if-nez v10, :cond_13

    invoke-static {v9, v2, v8, v12}, Lkv;->a(Ljava/lang/String;IIC)I

    move-result v5

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1

    move-object v1, v9

    move v3, v5

    move v12, v5

    move/from16 v5, v17

    move v15, v6

    move/from16 v6, v18

    move/from16 v17, v7

    move/from16 v7, v19

    move v15, v8

    move/from16 v8, v20

    invoke-static/range {v1 .. v8}, Lkf;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v1

    if-eqz v13, :cond_11

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Lkf$a;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "%40"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_11
    iput-object v1, v0, Lkf$a;->b:Ljava/lang/String;

    if-eq v12, v15, :cond_12

    add-int/lit8 v2, v12, 0x1

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v1, v9

    move v3, v15

    invoke-static/range {v1 .. v8}, Lkf;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkf$a;->c:Ljava/lang/String;

    move/from16 v10, v16

    :cond_12
    move/from16 v13, v16

    goto :goto_8

    :cond_13
    move/from16 v17, v7

    move v15, v8

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v0, Lkf$a;->c:Ljava/lang/String;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "%40"

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v1, v9

    move v3, v15

    invoke-static/range {v1 .. v8}, Lkf;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkf$a;->c:Ljava/lang/String;

    :goto_8
    add-int/lit8 v2, v15, 0x1

    move/from16 v7, v17

    const/16 v6, 0x23

    const/16 v12, 0x3a

    const/16 v15, 0x2f

    goto/16 :goto_6

    :cond_14
    :pswitch_1
    move v15, v8

    invoke-static {v9, v2, v15}, Lkf$a;->c(Ljava/lang/String;II)I

    move-result v1

    add-int/lit8 v3, v1, 0x1

    if-ge v3, v15, :cond_15

    invoke-static {v9, v2, v1}, Lkf$a;->a(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkf$a;->d:Ljava/lang/String;

    invoke-static {v9, v3, v15}, Lkf$a;->d(Ljava/lang/String;II)I

    move-result v1

    iput v1, v0, Lkf$a;->e:I

    iget v1, v0, Lkf$a;->e:I

    if-ne v1, v14, :cond_16

    sget v1, Lkf$a$a;->d:I

    return v1

    :cond_15
    invoke-static {v9, v2, v1}, Lkf$a;->a(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkf$a;->d:Ljava/lang/String;

    iget-object v1, v0, Lkf$a;->a:Ljava/lang/String;

    invoke-static {v1}, Lkf;->a(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lkf$a;->e:I

    :cond_16
    iget-object v1, v0, Lkf$a;->d:Ljava/lang/String;

    if-nez v1, :cond_17

    sget v1, Lkf$a$a;->e:I

    return v1

    :cond_17
    :goto_9
    const-string v1, "?#"

    invoke-static {v9, v15, v11, v1}, Lkv;->a(Ljava/lang/String;IILjava/lang/String;)I

    move-result v1

    invoke-direct {v0, v9, v15, v1}, Lkf$a;->b(Ljava/lang/String;II)V

    if-ge v1, v11, :cond_18

    invoke-virtual {v9, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x3f

    if-ne v2, v3, :cond_18

    const/16 v2, 0x23

    invoke-static {v9, v1, v11, v2}, Lkv;->a(Ljava/lang/String;IIC)I

    move-result v10

    add-int/lit8 v2, v1, 0x1

    const-string v4, " \"\'<>#"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x1

    move-object v1, v9

    move v3, v10

    invoke-static/range {v1 .. v8}, Lkf;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkf;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lkf$a;->g:Ljava/util/List;

    move v1, v10

    :cond_18
    if-ge v1, v11, :cond_19

    invoke-virtual {v9, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x23

    if-ne v2, v3, :cond_19

    add-int/lit8 v2, v1, 0x1

    const-string v4, ""

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, v9

    move v3, v11

    invoke-static/range {v1 .. v8}, Lkf;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkf$a;->h:Ljava/lang/String;

    :cond_19
    sget v1, Lkf$a$a;->a:I

    return v1

    :cond_1a
    sget v1, Lkf$a$a;->b:I

    return v1

    :pswitch_data_0
    .packed-switch 0x3f
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Ljava/lang/String;)Lkf$a;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const-string v1, " \"\'<>#"

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lkf;->a(Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkf;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lkf$a;->g:Ljava/util/List;

    return-object p0
.end method

.method public final b()Lkf;
    .locals 2

    iget-object v0, p0, Lkf$a;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "scheme == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lkf$a;->d:Ljava/lang/String;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "host == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lkf;

    invoke-direct {v0, p0}, Lkf;-><init>(Lkf$a;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lkf$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkf$a;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/16 v2, 0x3a

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkf$a;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    iget-object v1, p0, Lkf$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkf$a;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkf$a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lkf$a;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_3

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkf$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lkf$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {p0}, Lkf$a;->a()I

    move-result v1

    iget-object v3, p0, Lkf$a;->a:Ljava/lang/String;

    invoke-static {v3}, Lkf;->a(Ljava/lang/String;)I

    move-result v3

    if-eq v1, v3, :cond_4

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v1, p0, Lkf$a;->f:Ljava/util/List;

    invoke-static {v0, v1}, Lkf;->a(Ljava/lang/StringBuilder;Ljava/util/List;)V

    iget-object v1, p0, Lkf$a;->g:Ljava/util/List;

    if-eqz v1, :cond_5

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkf$a;->g:Ljava/util/List;

    invoke-static {v0, v1}, Lkf;->b(Ljava/lang/StringBuilder;Ljava/util/List;)V

    :cond_5
    iget-object v1, p0, Lkf$a;->h:Ljava/lang/String;

    if-eqz v1, :cond_6

    const/16 v1, 0x23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkf$a;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
