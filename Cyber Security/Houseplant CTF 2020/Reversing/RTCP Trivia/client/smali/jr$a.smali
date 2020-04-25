.class public final Ljr$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:Z

.field c:I

.field d:I

.field e:I

.field f:Z

.field g:Z

.field h:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ljr$a;->c:I

    iput v0, p0, Ljr$a;->d:I

    iput v0, p0, Ljr$a;->e:I

    return-void
.end method


# virtual methods
.method public final a()Ljr;
    .locals 1

    new-instance v0, Ljr;

    invoke-direct {v0, p0}, Ljr;-><init>(Ljr$a;)V

    return-object v0
.end method
