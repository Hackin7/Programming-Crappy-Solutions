.class public final Llp;
.super Lko;


# instance fields
.field private final a:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final b:J

.field private final c:Lne;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLne;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lko;-><init>()V

    iput-object p1, p0, Llp;->a:Ljava/lang/String;

    iput-wide p2, p0, Llp;->b:J

    iput-object p4, p0, Llp;->c:Lne;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Llp;->b:J

    return-wide v0
.end method

.method public final b()Lne;
    .locals 1

    iget-object v0, p0, Llp;->c:Lne;

    return-object v0
.end method
