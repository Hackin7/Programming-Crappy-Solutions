.class public final Lmq;
.super Ljava/lang/Object;


# static fields
.field private static final a:[B

.field private static final b:[Ljava/lang/String;

.field private static final c:[Ljava/lang/String;

.field private static final d:Lmq;


# instance fields
.field private final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final f:Ljava/util/concurrent/CountDownLatch;

.field private g:[B

.field private h:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    const/16 v2, 0x2a

    aput-byte v2, v0, v1

    sput-object v0, Lmq;->a:[B

    new-array v0, v1, [Ljava/lang/String;

    sput-object v0, Lmq;->b:[Ljava/lang/String;

    const-string v0, "*"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lmq;->c:[Ljava/lang/String;

    new-instance v0, Lmq;

    invoke-direct {v0}, Lmq;-><init>()V

    sput-object v0, Lmq;->d:Lmq;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lmq;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lmq;->f:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method

.method private static a([B[[BI)Ljava/lang/String;
    .locals 13

    const/4 v0, 0x0

    array-length v1, p0

    move v2, v1

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_a

    add-int v3, v1, v2

    div-int/lit8 v3, v3, 0x2

    :goto_1
    const/16 v4, 0xa

    if-ltz v3, :cond_0

    aget-byte v5, p0, v3

    if-eq v5, v4, :cond_0

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    const/4 v5, 0x1

    move v6, v5

    :goto_2
    add-int v7, v3, v6

    aget-byte v8, p0, v7

    if-eq v8, v4, :cond_1

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_1
    sub-int v4, v7, v3

    move v8, p2

    move v6, v0

    move v9, v6

    move v10, v9

    :cond_2
    :goto_3
    if-eqz v6, :cond_3

    const/16 v6, 0x2e

    move v11, v6

    move v6, v0

    goto :goto_4

    :cond_3
    aget-object v11, p1, v8

    aget-byte v11, v11, v9

    and-int/lit16 v11, v11, 0xff

    :goto_4
    add-int v12, v3, v10

    aget-byte v12, p0, v12

    and-int/lit16 v12, v12, 0xff

    sub-int/2addr v11, v12

    if-nez v11, :cond_4

    add-int/lit8 v10, v10, 0x1

    add-int/lit8 v9, v9, 0x1

    if-eq v10, v4, :cond_4

    aget-object v12, p1, v8

    array-length v12, v12

    if-ne v12, v9, :cond_2

    array-length v6, p1

    sub-int/2addr v6, v5

    if-eq v8, v6, :cond_4

    add-int/lit8 v8, v8, 0x1

    const/4 v6, -0x1

    move v9, v6

    move v6, v5

    goto :goto_3

    :cond_4
    if-gez v11, :cond_5

    :goto_5
    add-int/lit8 v2, v3, -0x1

    goto :goto_0

    :cond_5
    if-lez v11, :cond_6

    :goto_6
    add-int/lit8 v1, v7, 0x1

    goto :goto_0

    :cond_6
    sub-int v5, v4, v10

    aget-object v6, p1, v8

    array-length v6, v6

    sub-int/2addr v6, v9

    :goto_7
    add-int/lit8 v8, v8, 0x1

    array-length v9, p1

    if-ge v8, v9, :cond_7

    aget-object v9, p1, v8

    array-length v9, v9

    add-int/2addr v6, v9

    goto :goto_7

    :cond_7
    if-ge v6, v5, :cond_8

    goto :goto_5

    :cond_8
    if-le v6, v5, :cond_9

    goto :goto_6

    :cond_9
    new-instance p1, Ljava/lang/String;

    sget-object p2, Lkv;->e:Ljava/nio/charset/Charset;

    invoke-direct {p1, p0, v3, v4, p2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object p1

    :cond_a
    const/4 p1, 0x0

    return-object p1
.end method

.method public static a()Lmq;
    .locals 1

    sget-object v0, Lmq;->d:Lmq;

    return-object v0
.end method

.method private a([Ljava/lang/String;)[Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lmq;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lmq;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_0
    :try_start_0
    const-class v3, Lmq;

    const-string v4, "publicsuffixes.gz"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v4, Lnj;

    invoke-static {v3}, Lnl;->a(Ljava/io/InputStream;)Lns;

    move-result-object v3

    invoke-direct {v4, v3}, Lnj;-><init>(Lns;)V

    invoke-static {v4}, Lnl;->a(Lns;)Lne;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-interface {v3}, Lne;->h()I

    move-result v4

    new-array v4, v4, [B

    invoke-interface {v3, v4}, Lne;->a([B)V

    invoke-interface {v3}, Lne;->h()I

    move-result v5

    new-array v5, v5, [B

    invoke-interface {v3, v5}, Lne;->a([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v3}, Lkv;->a(Ljava/io/Closeable;)V

    monitor-enter p0
    :try_end_2
    .catch Ljava/io/InterruptedIOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iput-object v4, p0, Lmq;->g:[B

    iput-object v5, p0, Lmq;->h:[B

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v3, p0, Lmq;->f:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_4
    .catch Ljava/io/InterruptedIOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :catchall_0
    move-exception v3

    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v3

    :catchall_1
    move-exception v4

    invoke-static {v3}, Lkv;->a(Ljava/io/Closeable;)V

    throw v4
    :try_end_6
    .catch Ljava/io/InterruptedIOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :cond_0
    :goto_1
    if-eqz v0, :cond_3

    :goto_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_4

    :catchall_2
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception v3

    :try_start_7
    invoke-static {}, Lmp;->c()Lmp;

    move-result-object v4

    const/4 v5, 0x5

    const-string v6, "Failed to read public suffix list"

    invoke-virtual {v4, v5, v6, v3}, Lmp;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-eqz v0, :cond_3

    goto :goto_2

    :goto_3
    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    throw p1

    :catch_1
    move v0, v2

    goto :goto_0

    :cond_2
    :try_start_8
    iget-object v0, p0, Lmq;->f:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_2

    :catch_2
    :cond_3
    :goto_4
    monitor-enter p0

    :try_start_9
    iget-object v0, p0, Lmq;->g:[B

    if-nez v0, :cond_4

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unable to load publicsuffixes.gz resource from the classpath."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    array-length v0, p1

    new-array v0, v0, [[B

    move v3, v1

    :goto_5
    array-length v4, p1

    if-ge v3, v4, :cond_5

    aget-object v4, p1, v3

    sget-object v5, Lkv;->e:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    aput-object v4, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_5
    move p1, v1

    :goto_6
    const/4 v3, 0x0

    array-length v4, v0

    if-ge p1, v4, :cond_7

    iget-object v4, p0, Lmq;->g:[B

    invoke-static {v4, v0, p1}, Lmq;->a([B[[BI)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    goto :goto_7

    :cond_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_6

    :cond_7
    move-object v4, v3

    :goto_7
    array-length p1, v0

    if-le p1, v2, :cond_9

    invoke-virtual {v0}, [[B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [[B

    move v5, v1

    :goto_8
    array-length v6, p1

    sub-int/2addr v6, v2

    if-ge v5, v6, :cond_9

    sget-object v6, Lmq;->a:[B

    aput-object v6, p1, v5

    iget-object v6, p0, Lmq;->g:[B

    invoke-static {v6, p1, v5}, Lmq;->a([B[[BI)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_8

    goto :goto_9

    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_9
    move-object v6, v3

    :goto_9
    if-eqz v6, :cond_b

    :goto_a
    array-length p1, v0

    sub-int/2addr p1, v2

    if-ge v1, p1, :cond_b

    iget-object p1, p0, Lmq;->h:[B

    invoke-static {p1, v0, v1}, Lmq;->a([B[[BI)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_a

    goto :goto_b

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_b
    move-object p1, v3

    :goto_b
    if-eqz p1, :cond_c

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "!"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "\\."

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_c
    if-nez v4, :cond_d

    if-nez v6, :cond_d

    sget-object p1, Lmq;->c:[Ljava/lang/String;

    return-object p1

    :cond_d
    if-eqz v4, :cond_e

    const-string p1, "\\."

    invoke-virtual {v4, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    goto :goto_c

    :cond_e
    sget-object p1, Lmq;->b:[Ljava/lang/String;

    :goto_c
    if-eqz v6, :cond_f

    const-string v0, "\\."

    invoke-virtual {v6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    goto :goto_d

    :cond_f
    sget-object v0, Lmq;->b:[Ljava/lang/String;

    :goto_d
    array-length v1, p1

    array-length v2, v0

    if-le v1, v2, :cond_10

    return-object p1

    :cond_10
    return-object v0

    :catchall_3
    move-exception p1

    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    throw p1
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "domain == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Ljava/net/IDN;->toUnicode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\."

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lmq;->a([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x21

    const/4 v3, 0x0

    array-length v4, v0

    array-length v5, v1

    if-ne v4, v5, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v4, v2, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    aget-object v4, v1, v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v2, :cond_2

    array-length v0, v0

    array-length v1, v1

    :goto_0
    sub-int/2addr v0, v1

    goto :goto_1

    :cond_2
    array-length v0, v0

    array-length v1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\\."

    invoke-virtual {p1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    :goto_2
    array-length v2, p1

    if-ge v0, v2, :cond_3

    aget-object v2, p1, v0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
